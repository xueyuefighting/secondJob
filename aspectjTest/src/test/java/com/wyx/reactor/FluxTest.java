package com.wyx.reactor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author zhangjlm
 * Flux 不接受null 值
 *
 */
public class FluxTest {
	public static void main(String[] args) {
		test9();
	}
	
	public static void test1() {
		Disposable dis = Flux.just("Hello", "").subscribe(System.out::println);
		System.out.println("发布字符结束");
		Flux.fromArray(new Integer[] {1, 2, 3}).subscribe(System.out::println);
		System.out.println("发布int结束");
	}
	
	/*
	 * generate() 生成序列 一次产生一个  需要调用complete()来结束生产
	 * 
	 */
	public static void test2() {
//		Flux.generate(sink -> {
//		    sink.next("Hello");
//		    sink.complete();//如果不加这行  将产生无限队列
//		}).subscribe(System.out::println);
		
		final Random random = new Random();
		Flux.generate(ArrayList::new,(list,sink)->{
//			for (int i = 0; i < 10; i++) {
//			}   这种是不可取的,一次generate() 只能sink.next() 也就是onNext 一次
			int value = random.nextInt(100);
			list.add(value);
			sink.next(value);
			if(list.size()==10) {
				sink.complete();
			}
			return list;
		}).subscribe(System.out::println);
//		Flux.generate(ArrayList::new, (list, sink) -> {
//			int value = random.nextInt(100);
//			list.add(value);
//			sink.next(value);
//		    if (list.size() == 10) {
//		    		sink.complete();
//		    }
//		    return list;
//		}).subscribe(System.out::println);
	}
	
	/*
	 * create() 生成序列 无论调没调用 complete() 都是产生一次  也就是create() 可以onNext多次
	 * 
	 */
	public static void test3() {
		Flux.create(sink -> {
		    for (int i = 0; i < 10; i++) {
		        sink.next(i);
		    }
//		    sink.complete();
		}).subscribe(System.out::println);
	}
	public static void test4() {
		//buffer 控制每个集合的数量
//		Flux.range(1, 100).buffer(2).subscribe(System.out::println);
		//range() 输出的数字范围 左闭右闭区间 bufferUtil 相当于一个折行元素操作 下面是 当元素遇到是3的倍数 换
//		Flux.range(1, 10).bufferUntil(i -> i % 3 == 0).subscribe(System.out::println);
		
		//bufferWhile 中设置的过滤条件 每当满足条件 收集到集合中 关闭当前集合 开启下一个集合
		Flux.range(1, 10).bufferWhile(i -> i % 3 == 0).subscribe(System.out::println);
	}
	
	//filter() 只收集满足方法中predicate指定条件的元素
	//没满足一次 收集到集合中 关闭当前集合 开启下一个集合
	//遇上面的方法共同特征是 Flux在输出的时候 调用内部toStream()方法 转为 java8中的Stream流 这样做的好处是
	//Flux和Mono都为一步操作 ，这样可以避免在主线程退出前收集到所有的元素。
	public static void test5() {
		Flux.range(1, 10).filter(i -> i % 2 == 0).subscribe(System.out::println);
	}
	
	public static void test6() {
		Flux.range(1, 100).window(20).subscribe(System.out::println);
	}
	
	//zipWith 操作符把当前流中的元素与另外一个流中的元素按照一对一的方式进行合并
	public static void test7() {
		Flux.just("a", "b")
        .zipWith(Flux.just("c", "d")).toStream().forEach(System.out::println);
//        .subscribe(System.out::println);
	}
	
	//取元素操作
	public static void test8() {
//		Flux.range(1, 1000).take(10).subscribe(System.out::println);
		final List<Integer> list = new ArrayList<Integer>();
		Flux.range(1, 1000).takeLast(10).subscribe(x->list.add(x));
		System.out.println(list.toString());
//		Flux.range(1, 1000).takeWhile(i -> i < 10).subscribe(System.out::println);
//		Flux.range(1, 1000).takeUntil(i -> i == 10).subscribe(System.out::println);
	}
	
	public static void test9() {
//		Flux.just(5, 10)
//        .concatMap(x -> Flux.intervalMillis(x * 10, 100).take(x))
//        .toStream()
//        .forEach(System.out::println);
		
		Flux.just(1, 2)
        .concatWith(Mono.error(new IllegalStateException()))
        .subscribe(System.out::println, System.err::println);
		
	}
	
	public static String read(String id) {
		return id+"00";
	}
}

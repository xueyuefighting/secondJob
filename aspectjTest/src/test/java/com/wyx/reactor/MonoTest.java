package com.wyx.reactor;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("12","13","13");
		list.stream()
		.map(FluxTest::read)
		.forEach(System.out::println);
//		test3();
	}
	
	public static void test1() {
		Optional<String> o = Optional.ofNullable(null);
		Disposable ds = Mono.justOrEmpty(o).subscribe(System.out::println);
	}

	public static void tset2() {
		Flux.range(1, 100).buffer(20).subscribe(System.out::println);
	}
	
	//reduce() 方法用于计算，本身返回一个Mono类型结果
	//reduceWith() 接受两个参数 第一个是初始值 在这基础上做计算
	public static void test3() {
		Flux.range(1, 100).reduce((x, y) -> x + y).subscribe(System.out::println);
		Flux.range(1, 100).reduceWith(() -> 100, (x, y) -> x + y).subscribe(System.out::println);
	}
}

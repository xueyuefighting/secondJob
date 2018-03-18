package com.wyx.reactor;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

public class Scheduler {
	public static void main(String[] args) {
//		Schedulers.parallel();
//		Schedulers.fromExecutorService(null);
		test1();
	}
	public static void say() {
				Flux.create(sink->{
					sink.next(Thread.currentThread().getName());
					sink.complete();
				})
				.publishOn(Schedulers.single())
				.map(x->String.format("[%s] %s", Thread.currentThread().getName()))
				.subscribeOn(Schedulers.parallel())
				.toStream()
				.forEach(System.out::println);
	}
	public static void test1() {
		Flux.create(sink -> {
				sink.next(Thread.currentThread().getName());
				sink.complete();
			})
			.publishOn(Schedulers.single())
			.map(x -> String.format("[%s] %s", Thread.currentThread().getName(), x))
			.publishOn(Schedulers.elastic())
			.map(x -> String.format("[%s] %s", Thread.currentThread().getName(), x))
			.subscribeOn(Schedulers.parallel())
			.toStream()
			.forEach(System.out::println);
	}
}

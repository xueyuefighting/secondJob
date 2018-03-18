package com.wyx.reactor;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class StepVerify {

	public static void main(String[] args) {
			test1();
	}
	public static void test1() {
		StepVerifier.create(Flux.just("a", "c"))
        .expectNext("a")
        .expectNext("b")
        .verifyComplete();
	}
}

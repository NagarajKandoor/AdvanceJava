package com.threads.com;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadExamples {

	public static void main(String[] args) {
		Executor executor = Executors.newFixedThreadPool(10);
		executor.execute(()->{
			System.out.println("Hi");
		});

	}

}

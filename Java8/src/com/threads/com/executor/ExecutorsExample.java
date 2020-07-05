package com.threads.com.executor;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsExample implements Callable<Integer> {
	private static Random random = new Random(System.currentTimeMillis());

	@Override
	public Integer call() throws Exception {
		Thread.sleep(1000);
		return random.nextInt(100);
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(5);
		Future<Integer>[] future = new Future[5];
		for (int i = 0; i < future.length; i++) {
			future[i] = newFixedThreadPool.submit(new ExecutorsExample());
		}
		for (int i = 0; i < future.length; i++) {
			Integer retVal = future[i].get();
			System.out.println(retVal);
		}
		newFixedThreadPool.shutdown();
	}

}

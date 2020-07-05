package com.threads.com.executor;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample implements Runnable {
	private static final int NUMBER_OF_THREADS = 5;
	private static final CountDownLatch latch = new CountDownLatch(NUMBER_OF_THREADS);
	private static Random random = new Random(System.currentTimeMillis());

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(NUMBER_OF_THREADS);
		for (int i = 0; i < NUMBER_OF_THREADS; i++) {
			executorService.execute(new CountDownLatchExample());
		}
		executorService.shutdown();
	}

	@Override
	public void run() {
		int randomSleepTime = random.nextInt(20000);
		System.out.println("[" + Thread.currentThread().getName() + "] Sleeping for " + randomSleepTime);
		try {
			Thread.sleep(randomSleepTime);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		latch.countDown();
		System.out.println("[" + Thread.currentThread().getName() + "] Waiting for latch.");
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("[" + Thread.currentThread().getName() + "] Finished.");
	}

}

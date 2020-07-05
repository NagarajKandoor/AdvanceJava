package com.threads.com;

public class ThreadNonSynchronization implements Runnable {
	private static int counter = 0;

	@Override
	public void run() {
		while (counter < 10) {
			synchronized (ThreadNonSynchronization.class) {
				System.out.println(Thread.currentThread().getName() + " Before " + counter);
				counter++;
				System.out.println(Thread.currentThread().getName() + " After " + counter);
			}

		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread[] thread = new Thread[5];
		for (int i = 0; i < thread.length; i++) {
			thread[i] = new Thread(new ThreadNonSynchronization(), "Thread" + i);
			thread[i].start();
		}
		for (int j = 0; j < thread.length; j++) {
			thread[j].join();
		}
	}

}

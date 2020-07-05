package com.threads.com;

import java.util.Random;

public class ThreadJoin implements Runnable{
	private Random rand = new Random(System.currentTimeMillis());

	@Override
	public void run() {
		for(int i=0;i<5000;i++) {
			rand.nextInt();
		}
		System.out.println(Thread.currentThread().getName());	
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread[] thread = new Thread[5];
		for(int i=0;i<thread.length;i++) {
			thread[i]= new Thread(new ThreadJoin(),"Thread"+i);
			thread[i].start();
		}
		for(int j=0;j<thread.length;j++) {
			thread[j].join();
		}
	}
}

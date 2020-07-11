package com.threads.com.lockdesign;

public class CounterSeparateLockSplit {
	private static final Object customerLock = new Object();
	private static final Object shippingLock = new Object();
	private long customerCount = 0;
	private long shippingCount = 0;

	public void incrementCustomer() {
		synchronized (customerLock) {
			customerCount++;
		}
	}

	public void incrementShipping() {
		synchronized (shippingLock) {
			shippingCount++;
		}
	}

	public long getCustomerCount() {
		synchronized (customerLock) {
			return customerCount;
		}
	}

	public long getShippingCount() {
		synchronized (shippingLock) {
			return shippingCount;
		}
	}

}

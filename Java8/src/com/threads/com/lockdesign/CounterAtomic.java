package com.threads.com.lockdesign;

import java.util.concurrent.atomic.AtomicLong;

public class CounterAtomic implements Counter {
	AtomicLong cLong = new AtomicLong();
	AtomicLong sLong = new AtomicLong();

	@Override
	public void incrementCustomer() {
		cLong.incrementAndGet();

	}

	@Override
	public void incrementShipping() {
		sLong.incrementAndGet();
	}

	@Override
	public long getCustomerCount() {
		return cLong.get();
	}

	@Override
	public long getShippingCount() {
		return sLong.get();
	}
}

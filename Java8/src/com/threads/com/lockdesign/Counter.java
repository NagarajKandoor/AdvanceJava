package com.threads.com.lockdesign;

public interface Counter {
	void incrementCustomer();

	void incrementShipping();

	long getCustomerCount();

	long getShippingCount();

}

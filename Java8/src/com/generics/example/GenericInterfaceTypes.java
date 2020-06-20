package com.generics.example;

import java.io.InputStream;
import java.io.Serializable;

public interface GenericInterfaceTypes<T, R> {

	R display(T data);
	
	<T,R> R display();
	
	<T extends InputStream & Serializable>  void display(R data,T Data);
}

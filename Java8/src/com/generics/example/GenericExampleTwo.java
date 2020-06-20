package com.generics.example;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Collection;

public class GenericExampleTwo implements GenericInterfaceTypes<String, Boolean> {

	@Override
	public Boolean display(String data) {
		return data.isEmpty();
	}

	@Override
	public <T, R> R display() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends InputStream & Serializable> void display(Boolean data, T Data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T extends InputStream & Serializable> void display123(Collection<?> datas) {
		// TODO Auto-generated method stub
		
	}
}

package com.interfacedesign.com;

@FunctionalInterface
public interface Java8InterfaceDesign {

	void performAction();

	default void print() {
		System.out.println("JAVA8");
	}

	static void printConsole() {
		System.out.println("JAVA8");
	}
}

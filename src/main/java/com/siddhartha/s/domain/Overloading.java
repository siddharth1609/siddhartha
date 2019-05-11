package com.siddhartha.s.domain;

public class Overloading {

	void show(int a) {
		System.out.println("int");
	}

	void show(Integer a) {
		System.out.println("Integer");
	}

	public static void main(String[] args) {

		Integer a = 10;
		Object o = 10;

		Overloading overloading = new Overloading();

		// overloading.show(a);
		/// overloading.show(o);

	}

}

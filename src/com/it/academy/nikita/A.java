package com.it.academy.nikita;

class A {
	private int y;

	A(int x) {
		y = x;
	}

}

class B extends A {
	private int x;

	B() {
		super(1);
		x = 0;
	}
}
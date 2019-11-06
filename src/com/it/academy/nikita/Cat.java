package com.it.academy.nikita;

public class Cat {
	static void Hi() {
		System.out.println("Hi");
	}
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Hi();
	}

}

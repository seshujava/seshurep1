package com.basicjava;

public enum Animal {
	DOG("tomy"),CAT("tom"),MOUSE("jerry");
	private String name;
	Animal(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
}

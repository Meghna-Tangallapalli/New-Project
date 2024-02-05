package com.javainheritence;

public class Car extends Engine {

	public void drive() {

		int engStatus = start();
		if (engStatus == 1) {
			System.out.println("Journey started successfully");
		} else {
			System.out.println("Journey failed");
		}
	}
}

package com.kuldeep.effective.java.generics.consumer;


public class PizzaBaker<I> {
	
	public PizzaBaker() {
	}

	public void consume(final I crust){
		System.out.println("consuming " + crust.toString());
	}
}

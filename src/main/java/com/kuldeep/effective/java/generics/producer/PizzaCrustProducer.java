package com.kuldeep.effective.java.generics.producer;

import com.kuldeep.effective.java.pojo.ItalianCrust;

public class PizzaCrustProducer<T> {
	
	public static final int ITALIAN = 0;
	public static final int HAND_TOSSED = 1;
	public static final int WHEAT_CRUST = 2;
	public static final int NORMAL = 3;
	
	@SuppressWarnings("unchecked")
	public T produce(final int choice,final int size){
		switch (choice) {
		case PizzaCrustProducer.ITALIAN:
			return (T) new ItalianCrust(size);
		case PizzaCrustProducer.NORMAL:
			return null;
		case PizzaCrustProducer.WHEAT_CRUST : 
			return null;
		case PizzaCrustProducer.HAND_TOSSED:
			return null;
		default:
			return null;
		}
	}
	

}

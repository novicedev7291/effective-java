package com.kuldeep.effective.java.app;

import com.kuldeep.effective.java.generics.consumer.PizzaBaker;
import com.kuldeep.effective.java.generics.producer.PizzaCrustProducer;
import com.kuldeep.effective.java.pojo.PizzaCrust;

public class App {

	public static void main(String[] args) {
		genericsProducerConsumer();
	}
	
	public static void genericsProducerConsumer(){
		PizzaCrustProducer<? extends PizzaCrust> producer = new PizzaCrustProducer<PizzaCrust>();
		PizzaBaker<? super PizzaCrust> consumer = new PizzaBaker<PizzaCrust>();
		consumer.consume(producer.produce(PizzaCrustProducer.ITALIAN, PizzaCrust.MEDIUM));
	}

}

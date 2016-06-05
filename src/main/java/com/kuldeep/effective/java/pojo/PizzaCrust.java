package com.kuldeep.effective.java.pojo;

import java.io.Serializable;

public abstract class PizzaCrust implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5678650696755742552L;
	
	public static final int SMALL = 0;
	public static final int MEDIUM = 1;
	public static final int LARGE = 2;
	
	private int size;
	private String name;
	
	public PizzaCrust() {
		name = "Hand Tossed Crust";
		size = PizzaCrust.SMALL;
	}
	
	public PizzaCrust(String name, int size){
		this.name = name;
		this.size = size;
	}
	
	public String getName(){ return name; }
	
	public int getSize(){ return this.size; }
	
	public abstract void addFlavour(String flavour);
	public abstract String getFlavour();
	
	@Override
	public String toString() {
		return "[ "+this.name + ", Size : " + (this.size == PizzaCrust.SMALL ? "SMALL" : this.size == PizzaCrust.MEDIUM ? "MEDIUM" : "LARGE") + " ]";
	}

}

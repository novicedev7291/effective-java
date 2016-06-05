package com.kuldeep.effective.java.pojo;

public class ItalianCrust extends PizzaCrust {

	/**
	 * 
	 */
	private static final long serialVersionUID = 931357770925589097L;
	
	private String flavour;
	
	public ItalianCrust() {
		super("Italian Crust", PizzaCrust.SMALL);
	}
	
	public ItalianCrust(int size){
		super("Italian Crust", size);
	}

	@Override
	public void addFlavour(String flavour) {
		this.flavour = flavour;
	}

	@Override
	public String getFlavour() {
		return this.flavour;
	}

}

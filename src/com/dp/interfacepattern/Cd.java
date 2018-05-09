package com.dp.interfacepattern;

public class Cd extends Goods {

	Cd(int qty, double price){
		super(qty, price);
	}
	
	@Override
	public boolean isTaxable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isImported() {
		// TODO Auto-generated method stub
		return true;
	}

	

}

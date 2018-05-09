package com.dp.interfacepattern;

public class Cosmetics extends Goods {

	Cosmetics(int qty, double price){
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
		return false;
	}

	

}

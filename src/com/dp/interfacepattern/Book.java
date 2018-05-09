package com.dp.interfacepattern;

public class Book extends Goods {
	
	Book(int qty, double price){
		super(qty, price);
	}

	@Override
	public boolean isTaxable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isImported() {
		// TODO Auto-generated method stub
		return false;
	}

	

}

package com.dp.composition;

public class Book implements ItemType {
	
	GoodsHelper helper;
	
	Book(int qty, double price){
		helper = new GoodsHelper(qty, price);
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
	
	public double getExtendedTax(){
		
		return helper.getExtendedTax(isTaxable(), isImported());
	}

	public double getExtendedTaxPrice(){
		
		return helper.getExtendedTaxPrice();
	}

}

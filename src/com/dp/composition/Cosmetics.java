package com.dp.composition;

public class Cosmetics implements ItemType {

GoodsHelper helper;
	
Cosmetics(int qty, double price){
		helper = new GoodsHelper(qty, price);
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

public double getExtendedTax(){
		
		return helper.getExtendedTax(isTaxable(), isImported());
	}

	public double getExtendedTaxPrice(){
		
		return helper.getExtendedTaxPrice();
	}

	

}

package com.dp.interfacepattern;

public abstract class Goods implements ItemType{
	
	public  int quantity;
	public  double price;
	public  TaxType tax = new TaxType();
	
	public Goods() {}
	
	public Goods(int quantity, double price) {
		super();
		this.quantity = quantity;
		this.price = price;
	}

	public abstract boolean isTaxable();
	
	public abstract boolean isImported();
	
	public double	getExtendedTax(){
		 tax.calculate(isTaxable(), isImported(), price);		 
		 return tax.getTotalUnitTax() * quantity; 
	}
	
	public double	getExtendedTaxPrice(){
		return (tax.getTotalUnitTax() + price) * quantity;
		
	}
	
	
}

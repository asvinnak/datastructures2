package com.dp.composition;

public class GoodsHelper {
	
	public  int quantity;
	public  double price;
	public  TaxType tax = new TaxType();
	
	public GoodsHelper() {}
	
	public GoodsHelper(int quantity, double price) {
		super();
		this.quantity = quantity;
		this.price = price;
	}
	
	public double	getExtendedTax(boolean isTaxed, boolean isImported){
		 tax.calculate(isTaxed, isImported, price);		 
		 return tax.getTotalUnitTax() * quantity; 
	}
	
	public double	getExtendedTaxPrice(){
		return (tax.getTotalUnitTax() + price) * quantity;
		
	}
	
	
}

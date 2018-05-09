package com.dp.interfacepattern;

public class TaxType {
	
	public static final double SALES_TAX= 0.10;
	public static final double IMPORT_TAX= 0.05;	
	
	private  double  saleTax= 0d;
	private  double importTax= 0d;
	
	
	
	public void calculate(boolean isTaxed, boolean isImported, double price){
		
		if(isTaxed)
			saleTax = price * SALES_TAX;
		if(isImported)
			importTax = price * IMPORT_TAX;
		
	}
	
	public double getTotalUnitTax(){
		return saleTax + importTax;		
	}
	
	

}

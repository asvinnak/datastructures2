package com.dp.composition;

import java.io.IOException;

public class Shopping {
	
	public static void main(String[] args) throws IOException {
		
		Book good1= new Book(3, 20.0);
		System.out.println("Book Taxes"+ good1.getExtendedTax());
		System.out.println("Book Extended Taxes"+ good1.getExtendedTaxPrice());
		
		Cd good2= new Cd(3, 20.0);
		System.out.println("Cd Taxes"+ good2.getExtendedTax());
		System.out.println("Cd Extended Taxes"+ good2.getExtendedTaxPrice());		
		
		Cosmetics good3= new Cosmetics(3, 20.0);
		System.out.println("Cosmetics Taxes"+ good3.getExtendedTax());
		System.out.println("Cosmetics Extended Taxes"+ good3.getExtendedTaxPrice());
		
	}
	

}

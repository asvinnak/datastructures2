/**
 * 
 */
package com.dp.composition;


public interface ItemType {
	
	public static int	BOOKS = 1;
	public static int	CD = 2;
	public static int	COSMETICS = 3;
	
	public abstract boolean isTaxable();
	
	public abstract boolean isImported();

}

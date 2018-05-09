package com.dp.Behavioural.observer;

public interface StockControl {
	public abstract void notify(int qty);	
	public abstract void updateStock(int qty);
	public abstract void addSubscriber(DeptObserver dept);
	public abstract  void removeSubscriber(DeptObserver dept);
	
	

}

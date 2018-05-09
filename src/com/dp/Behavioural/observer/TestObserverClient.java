package com.dp.Behavioural.observer;

public class TestObserverClient {
	
	public static void main(String[] args) throws Exception{
	
	StockControl sc = new StockControlBrocker();
	
	sc.addSubscriber(new LogisticDeptSubscripber());
	sc.addSubscriber(new SalesDeptSubscriber());
	
	sc.updateStock(3);
	
	
	}
}

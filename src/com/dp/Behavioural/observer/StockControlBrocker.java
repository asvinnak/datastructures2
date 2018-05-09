package com.dp.Behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class StockControlBrocker implements StockControl {

	List<DeptObserver> subscribers= new ArrayList<DeptObserver>();
	@Override
	public void notify(int qty) {
		
		for(DeptObserver o : subscribers){
			
			o.update(qty);
		}

	}

	@Override
	public void updateStock(int qty) {
		//Logic to update qty in Database
		
		notify(qty);

	}

	@Override
	public void addSubscriber(DeptObserver dept) {
		subscribers.add(dept);
	}

	@Override
	public void removeSubscriber(DeptObserver dept) {
		subscribers.remove(dept);
	}

}

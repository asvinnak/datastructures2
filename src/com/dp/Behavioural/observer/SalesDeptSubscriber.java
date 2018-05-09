package com.dp.Behavioural.observer;

public class SalesDeptSubscriber implements DeptObserver {

	@Override
	public void update(int qty) {
		System.out.println(" Notified By SalesDept");
	}

}

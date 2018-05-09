package com.dp.Behavioural.observer;

public class LogisticDeptSubscripber implements DeptObserver {

	@Override
	public void update(int qty) {
		System.out.println(" Notified By Logistics");

	}

}

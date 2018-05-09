package com.dp.interfacepattern.command;

public class Television implements CommercialElectronics {

	@Override
	public void on() {
		System.out.println(" On TV");

	}

	@Override
	public void mute() {
		System.out.println(" Mute TV");

	}

}

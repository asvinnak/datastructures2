package com.dp.interfacepattern.command;

public class SoundSystem implements CommercialElectronics {

	@Override
	public void on() {
		System.out.println(" On SoundSystem");

	}

	@Override
	public void mute() {
		System.out.println(" Multe  SoundSystem");

	}

}

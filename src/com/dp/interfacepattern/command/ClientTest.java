package com.dp.interfacepattern.command;

import java.util.ArrayList;
import java.util.List;


public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		 CommercialElectronics ce= new Television();
		 
		 OnCommandImpl cmd= new OnCommandImpl(ce);
		 ButtonInvoker	btn = new ButtonInvoker(cmd);
		 btn.click();
		 
		 Television tv = new Television();
		 SoundSystem ss= new SoundSystem();
		 List<CommercialElectronics> ceList= new ArrayList<CommercialElectronics>();
		 ceList.add(tv);
		 ceList.add(ss);
		 
		 MuteCommandImpl muteCmd=  new MuteCommandImpl(ceList);
		 ButtonInvoker btn1 = new ButtonInvoker(muteCmd);
		 btn1.click();
		 
		

	}

}

package com.dp.interfacepattern.command;

import java.util.List;

public class MuteCommandImpl implements Command {

	List<CommercialElectronics> ceList;
	
	public MuteCommandImpl(List<CommercialElectronics> ceList) {
		this.ceList = ceList;
	}
	
	@Override
	public void execute() {
		for(CommercialElectronics ce: ceList){
			ce.mute();
		}

	}

}

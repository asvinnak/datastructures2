package com.dp.interfacepattern.command;

public class OnCommandImpl implements Command {

	
	CommercialElectronics ce;
	
	
	OnCommandImpl(CommercialElectronics ce){
		this.ce = ce;
	}
	
	
	@Override
	public void execute() {
		ce.on();
	}

}

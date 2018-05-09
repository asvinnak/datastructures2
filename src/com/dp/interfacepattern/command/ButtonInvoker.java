package com.dp.interfacepattern.command;

public class ButtonInvoker {
	
	Command c;
	
	ButtonInvoker(Command c){
		this.c = c;		
	}
	
	void click(){
		c.execute();
	}

}

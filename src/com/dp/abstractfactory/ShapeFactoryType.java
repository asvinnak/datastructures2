package com.dp.abstractfactory;

public class ShapeFactoryType {
	
	
	
	public  ShapeFactory getShapeFactoryType(int shapeFactoryType){
		ShapeFactory	sf= null;
		if(Const.SIMPLE_TYPE == shapeFactoryType)
			sf = new SimpleShapeFactory();
		else
			sf = new ComplexShapeFactory();
		
		return sf;
		
	}

}

package com.dp.abstractfactory;


public class ClientFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ShapeFactoryType factoryTpye= new ShapeFactoryType();
		ShapeFactory f=factoryTpye.getShapeFactoryType(Const.COMPLEX_TYPE);		 
		Shape s= f.getShape(Const.SHAPE_HEXAGON);
		s.draw();
	}

}

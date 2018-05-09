package com.dp.factory;


public class ClientFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShapeFactory f= new SimpleShapeFactory();
		Shape s= f.getShape(Const.SHAPE_CIRCLE);
		s.draw();
	}

}

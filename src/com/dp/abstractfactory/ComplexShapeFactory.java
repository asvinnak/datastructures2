package com.dp.abstractfactory;




public class ComplexShapeFactory extends ShapeFactory {

	
	public Shape getShape(int shapeId) {
		Shape	shape= null;
		if(Const.SHAPE_HEXAGON == shapeId)
			shape= new Hexagon();
		else 
			System.out.println("No shape class exist for shapeId=" + shapeId);	
		
		return shape;
	}

}

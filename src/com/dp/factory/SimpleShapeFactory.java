package com.dp.factory;

public class SimpleShapeFactory extends ShapeFactory {

	
	public Shape getShape(int shapeId) {
		Shape shape;
		if(Const.SHAPE_CIRCLE == shapeId)
			shape = new Circle(); 
		else
			shape = new Square(); 
		
		return shape;
	}

}

package com.thinkitive.spring;

 class DependencyInjection2 {

}

class Drawing { 
	void draw() {
		System.out.println("");
	}
}

class Shape extends Drawing{
	private Shape shape;

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	public void drawShape() {
		this.shape.draw();
	}

	@Override
	public void draw() {
		
		
	}
	
public class Triangle extends Shape { 
//	public static void main(String[] args) {
//		Shape shape = new Shape();
//		Triangle triangle = new Triangle();
//		shape.setShape(triangle);
//	}
}

	
}
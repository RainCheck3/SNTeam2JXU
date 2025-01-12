package com.sapient.bridge;

import com.sapient.bridge.Shape;

public class Circle extends Shape {

	private int x, y, radius;
	
	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		drawAPI.drawCircle(radius,x,y);
	}

}

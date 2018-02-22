package myArea;

public class MyArea {
	static final float PI = 3.1415926f;
	
	
	
	protected float areaOfCircle(int radius) {
		float S = (float) (PI*Math.pow(radius, 2));
		return S;
	}
}
	
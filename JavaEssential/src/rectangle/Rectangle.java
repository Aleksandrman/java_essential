package rectangle;

public class Rectangle {
double side1;
double side2;
Rectangle(double side1, double side2){
	this.side1 = side1;
	this.side2 = side2;
}

double areaCalculator(){
	double s = side1*side2;
	return s;
}

double perimeterCalculator() {
	double p = side1*2 + side2*2;
	return p;
}


}
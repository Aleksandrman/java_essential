package car;

public class Car {
	int year;
	String color;
	
	Car(){
		this(10,"blue");
	}
	
	Car (int year){
		this(year, "blue");
		
	}
	
	Car(int year, String color){
	this.year = year;
	this.color = color;
}
}

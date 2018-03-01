package vehicles;

public enum Vehicles {
BMW(400000), MAZDA(300000), MERSEDEZ(500000), TOYOTA(300000), FORD(400000);
int price;
String color = "blue";
Vehicles(int price){
	this.price = price;
}
String color() {
	return color;
}
String toSting() {
	return  color + price + this.name();
}

}

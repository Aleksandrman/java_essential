package address;

public class Address {
int index, house, apartament;
String country, city, street;
public Address(int index, String country, String city, String street, int house, int apartament) {
	this.index = index;
	this.house = house;
	this.apartament = apartament;
	this.country = country;
	this.city = city;
	this.street = street;
}

public void getTextAddress(){
	System.out.println(index);
	System.out.println(country);
	System.out.println(city);
	System.out.println(street);
	System.out.println(house);
	System.out.println(apartament);
	
}

protected int getIndex() {
	return index;
}
protected void setIndex(int index) {
	this.index = index;
}
protected int getHouse() {
	return house;
}
protected void setHouse(int house) {
	this.house = house;
}
protected int getApartament() {
	return apartament;
}
protected void setApartament(int apartament) {
	this.apartament = apartament;
}
protected String getCountry() {
	return country;
}
protected void setCountry(String country) {
	this.country = country;
}
protected String getCity() {
	return city;
}
protected void setCity(String city) {
	this.city = city;
}
protected String getStreet() {
	return street;
}
protected void setStreet(String street) {
	this.street = street;
}

	
}

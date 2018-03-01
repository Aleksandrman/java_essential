package worker;

public class Worker {
	private String position;
	private int year;
	private String fio;
	
	
	Worker(){
		
	}
	
	
	Worker(String fio, String position, int year){
		this.fio = fio;
		this.position = position;
		this.year = year;
	}
	
	String getFio() {
	return fio;
}
	void setFio(String fio) {
	this.fio = fio;
}
	String getPosition() {
	return position;
}
	void setPosition(String position) {
	this.position = position;
}
	int getYear() {
	return year;
}
	void setYear(int year) {
	this.year = year;
}

}

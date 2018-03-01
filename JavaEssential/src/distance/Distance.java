package distance;

public class Distance {

	 double distance;
	 void print() {
		 	 }
	
	 static class Converte{
		
		 public Converte() {
			 
		 }
	 double convertMetrForKm(double distance) {
		 double dist = 0;
		 dist = distance * 1000;
		 return dist;
		 	 }
	 double convertRmForMetr(double distance) {
		 double dist = 0;
		 dist = distance * 0.001;
		 return dist;
		 	 }
	 double convertMetrForSm(double distance) {
		 double dist = 0;
		 dist = distance * 0.01;
		 return dist;
		 	 }
	 double convertSmForMetr(double distance) {
		 double dist = 0;
		 dist = distance * 100;
		 return dist;
		 	 }
	 
	 }
	 
	
	
	
	
	public static void main(String[] args) {
		Distance.Converte convert = new Converte();
		System.out.println(convert.convertMetrForKm(10));

	}

}

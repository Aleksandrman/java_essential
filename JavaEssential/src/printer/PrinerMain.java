package printer;

public class PrinerMain extends Printer{

	 public static void main(String[] args) {
	        // Приведение типа
		 Printer main = new PrinerMain();
	        Printer printer = new Printer();
	        
	        Printer main1 = (Printer) main;
	        

	        // Метод класа Printer доступен через екземпляр Main
	        main.print("Just a red color");
	        printer.print("Hello ", "World!");
	        main1.print("Hello ", "World!");
	        main1.print("Just a red color");
	    }

}

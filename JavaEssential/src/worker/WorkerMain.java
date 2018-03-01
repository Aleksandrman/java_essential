package worker;

import java.util.Scanner;

public class WorkerMain {
	
	
	
	public static void main(String[] args) {
	Worker[] worker = new Worker[5]	;
	Scanner sc = new Scanner(System.in);
	
	for(int i = 0; i<5;i++) {
		worker[i] = new Worker();
		System.out.println("in FIO workers");
		worker[i].setFio(sc.next());
//		worker[0] = new Worker("hi", "hi", 3); -- заполнение через конструктор
		System.out.println("in position workers");
		worker[i].setPosition(sc.next());
		System.out.println("in year of employment workers");
		worker[i].setYear(sc.nextInt());
			

		
		
	}
		
	for (Worker worker2 : worker) {
		System.out.println(worker2.getFio());
		System.out.println(worker2.getPosition());
		System.out.println(worker2.getYear());
	}	
		
	}

}

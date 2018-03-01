package zoo;

import java.util.ArrayList;

public class Zoo {

	public static void main(String[] args) {
		ArrayList<String> zoo = new ArrayList<>();
			zoo.add("bulls");
			zoo.add("bear");
			zoo.add("dog");
			zoo.add("cat");
			zoo.add("burds");
			zoo.add("enot");
			zoo.add("ktocodayl");
			zoo.add("mouse");
						for (String zoo1 : zoo) {
				System.out.print(zoo1+ " ");
						}
						System.out.println();
						System.out.println(zoo.size());
						zoo.remove(7);
						zoo.remove(4);
						zoo.remove(2);
						
						
				        
				System.out.println(zoo.size());
				for (String zoo1 : zoo) {
					System.out.print(zoo1+ " ");
							}		
	}	
}

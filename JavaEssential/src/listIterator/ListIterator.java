package listIterator;
//
//import java.util.ArrayList;
//import java.util.Iterator;
import java.util.*;

public class ListIterator {
		
//	    public static void main(String[] args) {
//	        // Создаем список
//	        ArrayList<Integer> list = new ArrayList<>();
//
//	        // Добавление елементов
//	        list.add(1);
//	        list.add(2);
//	        list.add(3);
//	        list.add(4);
//
//	        // Создаем итератор
//	        ListIterator<Integer> iterator = list.listIterator();
//
//	        // Проходимся по массиву до конца
//	        while (iterator.hasNext()) {
//	            // Редактируем елементы списка(+2 так как индекс итератора с 0)
//	            list.set(iterator.nextIndex(), iterator.nextIndex() + 2);
//	            System.out.println(iterator.next());
//	        }
//	    }

	public static void main(String[] args) {
	ArrayList<Integer> arr = new ArrayList<>();
	for(int i=0;i<10; i++) {
		arr.add(i+1);
		}
	System.out.println(arr);
	
	 
	Iterator<Integer> iterator = arr.listIterator();
	int i=0;
	while(iterator.hasNext()) {
		Integer integer = iterator.next();
		arr.set(integer-1, integer +100);
		System.out.println(integer);
		
				
	}
	System.out.println(arr);
	}

}

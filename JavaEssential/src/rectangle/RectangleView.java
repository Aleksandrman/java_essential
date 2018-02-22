package rectangle;

import java.util.Scanner;

	
public class RectangleView {
	Scanner sc = new Scanner(System.in);
	int a,b;
	
	RectangleView(){
	
	System.out.println("Введите значение сторон прямоугольника");
	System.out.println("Сторона а");
	a = sc.nextInt();
	System.out.println("Сторона b");
	b = sc.nextInt();
	Rectangle rectangle = new Rectangle(a, b);
	System.out.println("площадь прямоугольника равна " + rectangle.areaCalculator());
	System.out.println("периметр прямоугольника равен " + rectangle.perimeterCalculator());
}
}
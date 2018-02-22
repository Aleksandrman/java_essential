package book;

import java.util.Scanner;

class BookMain {
static void main(String[] args) {
	Title title = new Title();
	Author author = new Author();
	Content content = new Content();
	
	String text;
	Scanner sc = new Scanner(System.in);
	System.out.println("Введите название ");
	title.setTitle(sc.nextLine());
	System.out.println("Введите имя автора ");
	author.setAuthor(sc.nextLine());
	System.out.println("Введите содержание ");
	content.setContent(sc.nextLine());
	
	title.show();
	author.show();
	content.show();
	
	
}
}

package com.techlabs.test;
import java.util.Scanner;
import com.techlabs.model.Book;
public class BookTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book books[] = new Book[2];
		
		
		for (int i = 0; i < books.length; i++) {
		System.out.println("Enter Book ID:");
		int bookId = sc.nextInt();
		System.out.println("Enter Name:");
		String name = sc.next();
		System.out.println("Enter Author");
		String author = sc.next();
		System.out.println("Enter Price:");
		double price = sc.nextDouble();
		System.out.println("Enter Publication");
		String publication = sc.next();
		
		books[i] = new Book(bookId,name,author,price,publication);
		
		}
		
		for (int i = 0; i < books.length; i++) {
			System.out.println("Book ID:"+books[i].getBookId());
			
			System.out.println("Name:"+books[i].getName());
			
			System.out.println("Author"+books[i].getAuthor());
			
			System.out.println("Price:"+books[i].getPrice());
			
			System.out.println("Publication"+books[i].getPublication());
			}
		
		displayBooks(books);
		
		sc.close();
	}
	
	public static void displayBooks(Book[] books) {
		

		Book temp;
        for (int i = 0; i< books.length ; i++) {
        	for(int j = i+1; j< books.length; j++) {
            if (books[j].getPrice() > books[i].getPrice()) {
                temp = books[i];
                books[i] = books[j];
                books[j] = temp;
                
            }
            
        	}
        }
        System.out.println("   ");
        System.out.println("--------------------------------");
        System.out.println("    ");
        System.out.println("Books in Descending Order of Price:  \n");
        for (int i = 0; i < books.length; i++) {
			System.out.println("Book ID:"+books[i].getBookId());
			
			System.out.println("Name:"+books[i].getName());
			
			System.out.println("Author"+books[i].getAuthor());
			
			System.out.println("Price:"+books[i].getPrice());
			
			System.out.println("Publication"+books[i].getPublication());
			}System.out.println("---------------------------------------");
	}
	

}

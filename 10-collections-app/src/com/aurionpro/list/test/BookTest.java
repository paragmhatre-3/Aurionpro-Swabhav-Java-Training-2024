package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.list.model.Book;

public class BookTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Book> books = new ArrayList<Book>();
		
		//Creating and Comparing Books
		createBook(books,scanner);
		comparator1(books);
		
		//Printing Compared Books
		System.out.println("After Sorting by First Sequence :");
		printBooks(books);
		
		comparator2(books);
		System.out.println("After Sorting by Second Sequence :");
		printBooks(books);
		
		
	}

	private static void printBooks(List<Book>books) {
        for (Book str : books) {
            System.out.println(str);
        }		
	}

	private static void createBook(List<Book>books, Scanner scanner) {
		System.out.println("How many Books do you want to create?");
		int size = scanner.nextInt();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter Book Title:");
			String title = scanner.next();
			System.out.println("Enter Book's Author:");
			String author = scanner.next();
			System.out.println("Enter Price:");
			double price = scanner.nextDouble();
			System.out.println("Enter Book's Publication Year:");
			int publicationYear = scanner.nextInt();

			books.add(new Book(title, author, price,publicationYear));	
			
		}
		
	}
	
	public static void comparator1(List<Book>books) {
		Comparator<Book> compareByTitle = Comparator.comparing(Book::getTitle);
		Comparator<Book> compareByAuthor = Comparator.comparing(Book::getAuthor);
		Comparator<Book> compareByPrice = Comparator.comparingDouble(Book::getPrice);
		
		Comparator<Book> combinedComparator = compareByAuthor
                .thenComparing(compareByTitle)
				.thenComparing(compareByPrice);
		Collections.sort(books, combinedComparator);
	}
	public static void comparator2(List<Book>books) {
		Comparator<Book> compareByAuthor = Comparator.comparing(Book::getAuthor);
		Comparator<Book> compareByPublicationYear = Comparator.comparingInt(Book::getPublicationYear);
		Comparator<Book> compareByPrice = Comparator.comparingDouble(Book::getPrice);
		
		Comparator<Book> combinedComparator = compareByPublicationYear
                .thenComparing(compareByPrice)
                .thenComparing(compareByAuthor);
		Collections.sort(books, combinedComparator);
	}

}

package com.aurionpro.list.model;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book>{

	@Override
	public int compare(Book book1, Book book2) {
		return (int) (book1.getPrice() - book2.getPrice());
	}

}

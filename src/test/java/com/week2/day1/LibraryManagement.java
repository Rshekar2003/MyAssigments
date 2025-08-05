package com.week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {
		Library library = new Library();
		String booktitle = library.addBook("Marvels");
		System.out.println("BookTitle is :" + booktitle);
		library.issueBook();

	}

}

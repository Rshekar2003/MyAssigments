package com.week2.day1;

public class Library {

	
	public String addBook(String bookTitle) {
		
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	public void issueBook() {
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[] args) {
		
		Library library = new Library();
		String booktitle = library.addBook("Harrypotter");
		System.out.println("BookTitle is :" + booktitle);
		library.issueBook();
		
	}

}

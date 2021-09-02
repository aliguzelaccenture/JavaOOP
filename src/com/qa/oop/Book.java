package com.qa.oop;

public class Book {
	String title;
	String blurb;
	String author;
	String publisher;
	int year;
	int pages;
	
	public Book() {
		this.title = "Harry Potter and the Chamber of Secrets";
		this.blurb = "Harry Potter and the Chamber of Secrets begins when Harry is spending a miserable summer with his only remaining family, the Dursleys. During a dinner party hosted by his uncle and aunt, Harry is visited by Dobby, a house-elf.";
		this.author = "J.K. Rowling";
		this.publisher = "Bloomsbury Publishing";
		this.year = 1998;
		this.pages = 251;
	}
	
	public void readBook() {
		System.out.println("Begin Reading");
		for (int i = 0; i <= pages; i++) {
			System.out.println("Page: " + i);
		}
	}
	
	
}

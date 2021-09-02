package com.qa.oop;

public class Book {
	private static int booksMade;
	private String title;
	private String blurb;
	private String author;
	private String publisher;
	private int year;
	private int pages;
	private static String category = "Bestseller";
	
	public Book() {
		super();
		booksMade++;
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
	
	public static void staticMethod() {
		System.out.println("this is a static method");
	}

	

	public Book(String title, String blurb, String author, String publisher, int year, int pages) {
		super();
		booksMade++;
		this.title = title;
		this.blurb = blurb;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
		this.pages = pages;
	}

	public static int getBooksMade() {
		return booksMade;
	}

	public static void setBooksMade(int booksMade) {
		Book.booksMade = booksMade;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBlurb() {
		return blurb;
	}

	public void setBlurb(String blurb) {
		this.blurb = blurb;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year < 1990) {
			System.out.println("Year cannot be less than 1990");
		} else {
			this.year = year;
		}
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public static String getCategory() {
		return category;
	}

	public static void setCategory(String category) {
		Book.category = category;
	}
	
	
	
	
}

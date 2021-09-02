package com.qa.oop;

public class Runner {

	public static void main(String[] args) {
		Book harryPotter2 = new Book();
		Book madeUpBook = new Book ("title", null, null, null, 0, 10);
		System.out.println(Book.getBooksMade());
		
		System.out.println(harryPotter2.getCategory());
		harryPotter2.setCategory("Not Bestseller");
		System.out.println(harryPotter2.getCategory());
		
		System.out.println(madeUpBook.getCategory());
		Book.setCategory("ALL RUBBISH");
		System.out.println(madeUpBook.getCategory());
		System.out.println(harryPotter2.getCategory());

		Book.staticMethod();
		madeUpBook.staticMethod();
	}

}

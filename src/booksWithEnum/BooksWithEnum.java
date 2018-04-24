package booksWithEnum;

import library.Book;


public class BooksWithEnum extends Book {
	
	public enum Style{
		SCIFI, ROMANCE, COOK, OTHER
	}

	Sytle style;

	public BooksWithEnum(String writerName, String bookName, int yearOfRelease,
			int price, style style) {
		super(writerName, bookName, yearOfRelease, price);
		this.Style = style;
	}

	public String toString() {
		return "BooksWithEnum [toString()=" + super.toString() + "]";
	}

	public Sytle getStyle() {
		return style;
	}

	

	
	 

	

}

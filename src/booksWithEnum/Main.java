package booksWithEnum;

import java.util.Scanner;

import library.Book;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int numberOfBooks=scanner.nextInt();
		BooksWithEnum[] books=new BooksWithEnum[numberOfBooks];
		for (int i = 0; i < books.length; i++) {
			books[i]=new BooksWithEnum("Cica", "Kutya", 1554, 124124, Style.SCIFI)
		}
		displayBookArrayData(books);
		BooksWithEnum[] scifibooks=getBooksWithStyle(books, Style.SCIFI);
		for (BooksWithEnum booksWithEnum : scifibooks) {
			System.out.println(booksWithEnum);
		}

	}
	public static void displayBookArrayData(Book[] books){
		for (Book book : books) {
			System.out.println(book);
		}
	}
	public static BooksWithEnum[] getBooksWithStyle(BooksWithEnum[] books, Style style){
		BooksWithEnum[] tempenumbooks=new BooksWithEnum[books.length];
		int counter=0;
		for (BooksWithEnum booksWithEnum : books) {
			if(booksWithEnum.getStyle()==style){
				tempenumbooks[counter]=booksWithEnum;
				counter++;
			}
		}
		BooksWithEnum[] enumbooks=new BooksWithEnum[counter];
		for (int i = 0; i < counter; i++) {
			enumbooks[i]=tempenumbooks[i];
		}
		BooksWithEnum[] enumbooks=new BooksWithEnum(books.length);
		return enumbooks;
	}

}

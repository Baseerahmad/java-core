package com.learning.core.day3session2.D03P08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.TreeSet;

class Book implements Comparable<Book> {
    private int bookId;
    private String title;
    private double price;
    private Date dateOfPublication;
    private String author;

    public Book(int bookId, String title, double price, String author, String dateOfPublication) throws ParseException {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.author = author;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.dateOfPublication = dateFormat.parse(dateOfPublication);
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Date getDateOfPublication() {
        return dateOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return bookId + " " + title + " " + price + " " + author + " " + dateFormat.format(dateOfPublication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, title, price, dateOfPublication, author);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book book = (Book) obj;
        return bookId == book.bookId &&
                Double.compare(book.price, price) == 0 &&
                Objects.equals(title, book.title) &&
                Objects.equals(dateOfPublication, book.dateOfPublication) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int compareTo(Book other) {
        return this.author.compareTo(other.author);
    }
}

public class BookFour {
	public static void main(String[] args) {
        try {
            TreeSet<Book> bookSet = new TreeSet<>();
            bookSet.add(new Book(1003, "Java Programming", 523.0, "Gilad Bracha", "23/11/1984"));
            bookSet.add(new Book(1004, "Read C++", 295.0, "Henry Harvin", "19/11/1984"));
            bookSet.add(new Book(1005, ".Net Platform", 3497.0, "Mark J. Price", "6/3/1984"));
            bookSet.add(new Book(1001, "Python Learning", 715.0, "Martic C. Brown", "2/2/2020"));
            bookSet.add(new Book(1002, "Modern Mainframe", 295.0, "Sharad", "19/5/1997"));

            for (Book book : bookSet) {
                System.out.println(book);
            }
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }

	}
}

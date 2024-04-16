package com.learning.core.day3session2.D03P08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeSet;

class Books implements Comparable<Books> {
    private int BooksId;
    private String title;
    private double price;
    private Date dateOfPublication;
    private String author;
 
    public Books(int BooksId, String title, double price, String author, String dateOfPublication) throws ParseException {
        this.BooksId = BooksId;
        this.title = title;
        this.price = price;
        this.author = author;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.dateOfPublication = sdf.parse(dateOfPublication);
    }
 
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return BooksId + " " + title + " " + price + " " + author + " " + sdf.format(dateOfPublication);
    }
 
    @Override
    public int hashCode() {
        return BooksId;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Books)) return false;
        Books other = (Books) obj;
        return this.BooksId == other.BooksId;
    }
 
    @Override
    public int compareTo(Books other) {
        return this.author.compareTo(other.author);
    }
}
 
public class MainTwo {
    public static void main(String[] args) throws ParseException {
        TreeSet<Books> Bookss = new TreeSet<>();
        
        // Adding Books details
        Bookss.add(new Books(1001, "Python Learning", 715.0, "Martic C. Brown", "2/2/2020"));
        Bookss.add(new Books(1002, "Modern Mainframe", 295.0, "Sharad", "19/5/1997"));
        Bookss.add(new Books(1003, "Java Programming", 523.0, "Gilad Bracha", "23/11/1984"));
        Bookss.add(new Books(1004, "Read C++", 295.0, "Henry Harvin", "19/11/1984"));
        Bookss.add(new Books(1005, ".Net Platform", 3497.0, "Mark J. Price", "6/3/1984"));
 
        // Printing all Books details
        for (Books Books : Bookss) {
            System.out.println(Books);
        }
    }
}

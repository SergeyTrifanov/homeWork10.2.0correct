package ru.skypro;

import java.util.Objects;

public class Book {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pubDay == book.pubDay && nameBook.equals(book.nameBook) && bookAuthor.equals(book.bookAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, bookAuthor, pubDay);
    }

    private String nameBook;
    private Author bookAuthor;
    private int pubDay;


    public Book(String nameBook, Author bookAuthor, int pubDay){
        this.nameBook = nameBook;
        this.bookAuthor = bookAuthor;
        this.pubDay = pubDay;
    }
    public String getNameBook(){
        return this.nameBook;
    }
    public Author getBookAuthor(){
        return this.bookAuthor;
    }
    public void setPubDay(int pubDay){
        this.pubDay = pubDay;
    }
    public String toString(){
        return "[" + this.nameBook + " " + this.bookAuthor + " " + this.pubDay + "]";
    }
}


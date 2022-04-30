package ru.skypro;

import java.util.Objects;

public class Book {
    private String nameBook;
    private Author bookAuthor;
    int pubDay;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pubDay == book.pubDay && nameBook.equals(book.nameBook);
    }



    @Override
    public int hashCode() {
        return Objects.hash(nameBook, pubDay);
    }

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


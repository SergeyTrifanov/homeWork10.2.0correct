package ru.skypro;

import java.util.Objects;

public class Author {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return firstName.equals(author.firstName) && secondName.equals(author.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName);
    }

    private String firstName;
    private String secondName;

    public Author(String firstName, String secondName){
        this.firstName=firstName;
        this.secondName=secondName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getSecondName(){
        return this.secondName;
    }
    public String toString(){
        return this.firstName + " " + this.secondName;


    }
}

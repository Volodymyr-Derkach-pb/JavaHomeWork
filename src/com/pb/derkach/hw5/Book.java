package com.pb.derkach.hw5;

public class Book {


    private String nameofbook; //- название
    private String autor; // - автор книги
    int year; // - год издания

    /**
     * Класс Book хранит такую информацию о книге:
     * - название
     * - автор книги
     * - год издания
     */

    public Book (String nameofbook, String autor, int year) {
        this.nameofbook = nameofbook;
        this.autor = autor;
        this.year = year;
    }

    public Book() {

    }

    public String getNameofbook() {
        return nameofbook;
    }

    public void setNameofbook (String nameofbook) {
        this.nameofbook = nameofbook;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String author) {
        this.autor = author;
    }

    public  int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getInfo() {
        return "{" +
                "name='" + nameofbook + '\'' +
                ", author='" + autor + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}

package com.pb.derkach.hw5;

public class Reader {

    private String fio; // - ФИО (Фамилия инициалы)
    private int nrt; // - номер читательского билет (number read ticket)
    private String fakult; //- факультет
    private String birthdata; //- дата рождения
    private String numbtel; //- телефон


    /**
     * Класс Reader хранит такую информацию о пользователе библиотеки:
     * - ФИО
     * - номер читательского билета
     * - факультет
     * - дата рождения
     * - телефон
     * Типы полей выбирать на свое усмотрение.
     *
     */

    public Reader(String fio, int nrt, String fakult, String birthdata, String numbtel){
        this.fio = fio;
        this.nrt = nrt;
        this.fakult = fakult;
        this.birthdata = birthdata;
        this.numbtel = numbtel;
    }

    public Reader(){

    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getNrt() {
        return nrt;
    }

    public void setNrt(int nrt) {
        this.nrt = nrt;
    }

    public String getFakult() {
        return fakult;
    }

    public void setFakult(String fakult) {
        this.fakult = fakult;
    }

    public String getBirthdata() {
        return birthdata;
    }

    public void setBirthdata(String birthdata) {
        this.birthdata = birthdata;
    }

    public String getNumbtel() {
        return numbtel;
    }

    public void setNumbtel(String numbtel) {
        this.numbtel = numbtel;
    }

    /**
     *
     * Имеет перегруженные методы takeBook(), returnBook():
     *
     */

    /**
     *
     * - takeBook, который будет принимать количество взятых книг.
     * Выводит на консоль сообщение
     * "Петров В. В. взял 3 книги".
     *
     */

    public void takeBook(int number) {
        System.out.println('\"'+ this.fio + " взял " + number + " книги"  + '\"' + "." );
    }

    /**
     *
     * - takeBook, который будет принимать переменное количество названий книг.
     * Выводит на консоль сообщение
     * "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
     *
     */

    public void takeBook (String... books){
        System.out.println('\"' + this.fio + " взял книги: " );
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println('\"'+ ".");
    }

    /**
     *
     * - takeBook, который будет принимать переменное количество объектов класса Book.
     * Выводит на консоль сообщение
     * "Петров В. В. взял книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".
     */

    public void takeBook(Book... books) {
        System.out.println(this.fio + " взял книги:");
        for (Book book : books) {
            System.out.println(book.getNameofbook() + "(" + book.getAutor() + book.year + " г." + ")");
        }
        System.out.println();
    }

    /**
     *
     * Аналогичным образом перегрузить метод returnBook().
     */

    /**
     *
     * Должно быть 3 метода returnBook() которые выводит на консоль сообщения:
     * - "Петров В. В. вернул 3 книги"
     * - "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
     * - "Петров В. В. вернул книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".
     */

    public void returnBook(int number) {
        System.out.println(this.fio + " вернул " + number + " книги");
    }

    public void returnBook(String... books) {
        System.out.println(this.fio + " вернул книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(this.fio + " вернул книги:");
        for (Book book : books) {
            System.out.println(book.getNameofbook() + "(" + book.getAutor() + book.year + " г." + ")");
        }
        System.out.println();
    }

    public String getInfo() {
        return "[" +
                "Фамилия инициалы: " + fio +
                ", номер читательского билета: " + nrt +
                ", факультет: " + fakult  +
                ", дата рождения: " + birthdata +
                ", телефон: " + numbtel  +
                ']';
    }


/**
 *
 */





}

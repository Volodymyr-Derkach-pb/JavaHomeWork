package com.pb.derkach.hw5;

public class Library {

    public static void main(String[] args) {

        Book book1 = new Book("Приключения", "Иванов И. И." , 2000);
        Book book2 = new Book("Словарь", "Сидоров А. В." , 1980);
        Book book3 = new Book("Энциклопедия", "Гусев К. В." , 2010);
        Book[] books = {book1, book2, book3};


        Reader reader1 = new Reader("Петров В.В.", 1, "АБВГД", "01.01.2001", "+380671234567");
        Reader reader2 = new Reader("Иванов Ю.В.", 2, "ЕПРС", "01.01.2001", "+3806776543321");
        Reader reader3 = new Reader("Пупкин В.В.", 3, "ЕПТ", "01.01.2001", "+3806773543321");

        Reader[] readers = {reader1, reader2, reader3};

        //- демонстрируется работа всех вариантов методов takeBook() и returnBook().

        reader1.takeBook(3);
        reader1.takeBook("Приключения", "Словарь", "Энциклопедия");
        reader1.takeBook(book1, book2, book3);

        reader1.returnBook(3);
        reader1.returnBook("Приключения", "Словарь", "Энциклопедия");
        reader1.returnBook(book1, book2, book3);

        printBooks(books); // - печатаются все книги.

        printReaders(readers); // - печатаются все читатели.



    }

    //Класс Library используется как демонстрация работы классов Book и Reader.
    //Имеет метод main() в котором создается массивы объектов Book и Reader, по 3 или более элементов в каждом.
    //Выполняются такие действия:
    //- печатаются все книги.
    //- печатаются все читатели.
    //- демонстрируется работа всех вариантов методов takeBook() и returnBook().

    //- печатаются все книги.
    private static void printBooks(Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

    //- печатаются все читатели.
    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }
        System.out.println();
    }

}

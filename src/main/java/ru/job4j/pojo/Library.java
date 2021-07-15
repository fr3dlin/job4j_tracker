package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book nos = new Book("Nos", 330);
        Book ice = new Book("Ice", 354);
        Book hel = new Book("Hell", 666);
        Book cleanC = new Book("Clean code", 0);
        Book[] books = new Book[4];
        books[0] = nos;
        books[1] = ice;
        books[2] = hel;
        books[3] = cleanC;
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getName() + " - " + books[index].getCount());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getName() + " - " + books[index].getCount());
        }
        for (Book book : books) {
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getCount());
            }
        }
    }
}

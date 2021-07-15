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
        for (Book value : books) {
            System.out.println(value.getName() + " - " + value.getCount());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book value : books) {
            System.out.println(value.getName() + " - " + value.getCount());
        }
        for (Book book : books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getCount());
            }
        }
    }
}

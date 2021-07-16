package ru.job4j.poly;

public class Service {
    private Store store;

    public Service(DbStore store) {
        this.store = store;
    }

    public void extract() {
        store.save("Petr Arsentev");
    }

    public static void main(String[] args) {
        Store store = new DbStore();
        Service service = new Service(store);
        service.extract();
    }
}

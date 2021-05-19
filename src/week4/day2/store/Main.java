package week4.day2.store;

public class Main {
    public static void main(String[] args) {
        Store store=new Store();
        store.setName("Shop 1");
        store.setCountOfWorkers(50);
        store.setPhoneNumber("055164225");
        System.out.println(store.toString());
        store.sell();
    }
}

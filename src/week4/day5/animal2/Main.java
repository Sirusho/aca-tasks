package week4.day5.animal2;

import javax.security.auth.login.AccountNotFoundException;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Animal(5,"Animal");
        Cat animal1=new Cat(6, "Cat");
        Animal animal2=new Cat(1, "Baby cat");
        animal.sound();
        animal1.sound();
        animal2.sound();

    }
}

package month1.week4.day5.animal2;

public class Cat extends Animal {
    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    void sound() {
        System.out.println("Meow");
    }
}

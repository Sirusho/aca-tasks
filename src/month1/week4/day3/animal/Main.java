package month1.week4.day3.animal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Animal class");
        Animal animal=new Animal();
        animal.eat();
        animal.voice();

        System.out.println("Dog class");
        Dog dog=new Dog();
        dog.eat();
        dog.voice();
    }
}

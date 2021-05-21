package week4.day3.animal;

public class Dog extends Animal {
    @Override
    protected void voice() {
        System.out.println("Dog's voice");;
    }

    @Override
    protected void eat() {
        System.out.println("Dog's eat");;
    }
}

package week4.day3.animal;
/*
Task 1
Define a Animal class, which has two methods
voice() and eat() with modificator protected
Write Dog class where  are overrided methods: voice() and eat()
 */
public class Animal {
    protected void eat(){
        System.out.println("Eat");
    }
    protected void voice(){
        System.out.println("Voice");
    }
}

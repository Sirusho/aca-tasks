package week4.day1.student;

import java.util.Arrays;

/*
Write a java program which
has a Student class with fields age, name, weight
also write all argument constructor
has a Sort class with 3 methods ` sort() which will sort Students by` age,
      weight,
      name.
*sort() methods will get as a parameter array of Students.
         *Use method overloading.
also will have Main class, where methods will be called from Sort class.
 */
public class Student {
    int age;
    String name;
    double weight;

    public Student(int age, String name, double weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}

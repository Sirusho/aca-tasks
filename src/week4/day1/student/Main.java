package week4.day1.student;

public class Main {
    public static void main(String[] args) {
        Student students[]= new Student[3];
        students[0]=new Student(25, "Ann", 52.0);
        students[1]=new Student(30, "Mary", 65.5);
        students[2]=new Student(19,"Dave", 68.5);
        Sort sorting=new Sort();
        sorting.sort(students, students[0].age);
        System.out.println("\n sorted by age \n");
        for(int i=0; i<students.length; i++){
            System.out.println(students[i]+ " ");
        }
        System.out.println("\n sorted by name \n");
        sorting.sort(students, students[0].name);
        for(int i=0; i<students.length; i++){
            System.out.println(students[i]+ " ");
        }
        System.out.println("\n sorted by weight \n");
        sorting.sort(students, students[0].weight);

        for(int i=0; i<students.length; i++){
            System.out.println(students[i]+ " ");
        }




    }
}

package week4.day1.university;
/*if user choose one of these versions then print “Input your age” he must inputs his age, you must verify and then register him
add register() method which will change countOfStudents field
after these steps call display() method to see all changes

 */
public class Main {
    public static void main(String[] args) {
        University oxford=new University( " Oxford ", 998, 1000, 50, 18 );
        University cambridge=new University("Cambridge", 800, 805, 65, 18);
        System.out.println("For studying at " + oxford.name);
        oxford.admission();
        oxford.printInfo(oxford);
    }
}

package week4.day3.accounting;
/*
Write Accounting.java class, which has fields: countOfEmployers, departmentName and has method account()


 */
public class Accounting {
    protected int countOfEmployers;
    protected String departmentName;
    protected int account(){
        return 0;
    }

    @Override
    public String toString() {
        return "Accounting{" +
                "countOfEmployers=" + countOfEmployers +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }

    Accounting(){

}
    public Accounting(int countOfEmployers, String departmentName) {
        this.countOfEmployers = countOfEmployers;
        this.departmentName = departmentName;
    }

    public int getCountOfEmployers() {
        return countOfEmployers;
    }

    public void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}

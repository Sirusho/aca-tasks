package month1.week4.day3.accounting;

/*
Write TaxAccounting class, which has fields:
countOfEmployers,departmentName, which extends Accounting class and override account() method,which calculate taxOfCompany
 */
public class TaxAccounting extends Accounting {
    int salaryOfEmployers = 100;

    public TaxAccounting(int countOfEmployers, String departmentName) {
        super(countOfEmployers, departmentName);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int getCountOfEmployers() {
        return super.getCountOfEmployers();
    }

    @Override
    public void setCountOfEmployers(int countOfEmployers) {
        super.setCountOfEmployers(countOfEmployers);
    }

    @Override
    public String getDepartmentName() {
        return super.getDepartmentName();
    }

    @Override
    public void setDepartmentName(String departmentName) {
        super.setDepartmentName(departmentName);
    }

    TaxAccounting() {

    }

    @Override
    protected int account() {
        return (int) (salaryOfEmployers * countOfEmployers * 0.3);
    }

}

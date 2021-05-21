package week4.day3.accounting;
/*
Write FinancialAccount class, which has fields:
countOfEmployers,departmentName, which extend TaxAccounting class and override account() method,which calculate salaryOfEmployers
*Don’t forget about encapsulation
 */
public class FinancialAccounting extends TaxAccounting {

    public FinancialAccounting(int countOfEmployers, String departmentName) {
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

    FinancialAccounting() {
        super();
    }

    @Override
    protected int account() {
        return salaryOfEmployers*getCountOfEmployers();
    }
}

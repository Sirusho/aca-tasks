package week4.day3.itcompany;
/*
Write FinancialAccount class, which has fields:
countOfEmployers,departmentName, which extend TaxAccounting class and override account() method,
which calculate salaryOfEmployers

 */
public class FinancialAccounting extends TaxAccounting{
    FinancialAccounting(){

    }

    public FinancialAccounting(int countOfEmployers, String companyName) {
        super(countOfEmployers, companyName);
    }

    @Override
    int account() {
        return countOfEmployers*1000;
    }
}

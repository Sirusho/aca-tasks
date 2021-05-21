package week4.day3.itcompany;
/*
Write TaxAccounting class, which has fields:
countOfEmployers,departmentName, which extend Accounting class and override account() method,which calculate taxOfCompany
 */
public class TaxAccounting extends Accounting {
    public TaxAccounting(int countOfEmployers, String companyName) {
        super(countOfEmployers, companyName);
    }
    TaxAccounting(){

    }
    @Override
    int account() {
        return (int)(countOfEmployers*1000*0.3);
    }
}

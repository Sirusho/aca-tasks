package month1.week4.day3.itcompany;
/*
Write Accounting.java class,
which extend iTCompany class and has fields:
countOfEmployers, departmentName and has method account()

 */
public class Accounting extends ItCompany {
    @Override
    int account() {
        return countOfEmployers*1000;
    }
    Accounting(){

    }

    public Accounting(int countOfEmployers, String companyName) {
        super(countOfEmployers, companyName);
    }
}

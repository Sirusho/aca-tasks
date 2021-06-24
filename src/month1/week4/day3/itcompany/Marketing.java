package month1.week4.day3.itcompany;
/*
Write Marketing class, which extend iTCompany class and has fields:
 countOfEmployers, departmentName and has method marketing()
 */
public class Marketing extends ItCompany{

    public Marketing() {
    }

    public Marketing(int countOfEmployers, String companyName) {
        super(countOfEmployers, companyName);
    }

    void marketing(){
        System.out.println("Marketing inside Marketing class");
    }
}

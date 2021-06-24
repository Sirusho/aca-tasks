package month1.week4.day3.itcompany;
/*
Write SMM class, which extend Marketing class and has fields:
 countOfEmployers, departmentName and override method marketing()
 */
public class SMM extends Marketing{
    public SMM(int countOfEmployers, String companyName) {
        super(countOfEmployers, companyName);
    }

    @Override
    void marketing() {
        System.out.println("marketing method from SMM class");
    }
}

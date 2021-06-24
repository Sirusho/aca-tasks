package month1.week4.day3.itcompany;
/*
Write SEO class, which extend Marketing class and has fields:
countOfEmployers, departmentName and override method marketing()
 */
public class SEO extends Marketing {
    public SEO(int countOfEmployers, String companyName) {
        super(countOfEmployers, companyName);
    }

    public SEO() {
    }

    @Override
    void marketing() {
        System.out.println("Marketing method from SEO class");
    }
}

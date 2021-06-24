package month1.week4.day3.itcompany;
/*
Write ItCompany java class which has fields: countOfEmployers, companyName and has method account()
 */
public class ItCompany {
    int countOfEmployers;
    String companyName;


    int account(){
        return countOfEmployers*100;
    }

    public int getCountOfEmployers() {
        return countOfEmployers;
    }

    public void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ItCompany(int countOfEmployers, String companyName) {
        this.countOfEmployers = countOfEmployers;
        this.companyName = companyName;
    }

    public ItCompany() {
    }
}

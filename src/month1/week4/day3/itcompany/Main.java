package month1.week4.day3.itcompany;

public class Main {
    public static void main(String[] args) {
        ItCompany itCompany = new ItCompany();
        itCompany.setCountOfEmployers(30);
        itCompany.setCompanyName("Company name");
        System.out.println(itCompany.account());
        Accounting accounting = new Accounting();
        accounting.setCountOfEmployers(50);
        System.out.println(accounting.account());
        FinancialAccounting financialAccounting = new FinancialAccounting();
        financialAccounting.setCountOfEmployers(25);
        System.out.println(financialAccounting.account());
        TaxAccounting taxAccounting = new TaxAccounting();
        taxAccounting.setCountOfEmployers(15);
        System.out.println(taxAccounting.account());
    }
}

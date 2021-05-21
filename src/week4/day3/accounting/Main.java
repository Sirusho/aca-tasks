package week4.day3.accounting;

public class Main {
    public static void main(String[] args) {
    Accounting accounting=new Accounting();
    accounting.setCountOfEmployers(20);
    accounting.setDepartmentName("Department 1");
        System.out.println("Inside Accounting class\n");
        System.out.println(accounting.account());
        TaxAccounting taxAccounting=new TaxAccounting();
        taxAccounting.setCountOfEmployers(50);
        taxAccounting.setDepartmentName("Department 2");
        System.out.println("\nInside Tax Accounting class \n");
        System.out.println(taxAccounting.account());
        FinancialAccounting financialAccounting=new FinancialAccounting();
        financialAccounting.setCountOfEmployers(50);
        financialAccounting.setDepartmentName("Department 3");
        System.out.println("\nInside financial accounting class\n");
        System.out.println(financialAccounting.account());

    }

}

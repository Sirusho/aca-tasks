package month1.week4.day1.shop;

import java.util.Scanner;

/*
write method checkOrder() which will take as a parameter count of order,
and will give a response whether they have such an amount of product or not.
if they have that amount they ask “if you want to buy it,
Please press 1 , if you don’t want to buy it press any bottom”.
if they don’t have that amount of product, response` “Now we don’t have so much product,sorry ”
if they pressed 1, calculate price for order using calculateOrder() method,
 also add that count of money to your shopBalance using addToShopBalance() method
create class definition diagram
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Shop Task \n");
        Shop shop=new Shop("Zara", "Address 1", 15, 150, 50);
        Shop shop1=new Shop("DG", "Address 2", 200, 10000, 50000);
        System.out.println("Input count of order from " + shop.name);
        int count=scanner.nextInt();
        shop.checkOrder(count);
        System.out.println("Input count of order from " + shop1.name);
        int count2=scanner.nextInt();
        shop1.checkOrder(count2);

    }
}

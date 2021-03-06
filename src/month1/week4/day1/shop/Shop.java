package month1.week4.day1.shop;

import java.util.Scanner;

/*
.SHOP
Define a Shop.java class which
Has a fields name, address, countOfProduct,
priceForProduct, shopBalance.
define constructors with all possible fields
 */
public class Shop {
    String name;
    String address;
    int countOfProduct;
    int priceForProduct;
    int shopBalance;

    public void checkOrder(int countOfProduct){
        if(countOfProduct<=this.countOfProduct){
            Scanner scanner=new Scanner(System.in);
            System.out.println("if you want to buy it,\n" +
                    "Please press 1 , if you don’t want to buy it press any bottom”.");
            String input = scanner.nextLine();
            if(input.equals("1")){
                calculateOrder(this.countOfProduct, this.priceForProduct);
                addToShopBalance();
            }
        }else{
            System.out.println("Now we don’t have that amount of products,sorry");
        }

    }
    private int calculateOrder(int countOfProduct, int priceForProduct){
        System.out.println( this.countOfProduct*this.priceForProduct);
        return this.countOfProduct*this.priceForProduct;
    }
    private void addToShopBalance(){
        this.shopBalance=calculateOrder(this.countOfProduct, this.priceForProduct);
    }
    public Shop(String name) {
        this.name = name;
    }

    public Shop(String name, String address, int countOfProduct, int priceForProduct) {
        this.name = name;
        this.address = address;
        this.countOfProduct = countOfProduct;
        this.priceForProduct = priceForProduct;
    }

    public Shop(String name, String address, int countOfProduct) {
        this.name = name;
        this.address = address;
        this.countOfProduct = countOfProduct;
    }

    public Shop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Shop(String name, String address, int countOfProduct, int priceForProduct, int shopBalance) {
        this.name = name;
        this.address = address;
        this.countOfProduct = countOfProduct;
        this.priceForProduct = priceForProduct;
        this.shopBalance = shopBalance;
    }
}

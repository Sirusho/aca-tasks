package month1.week4.day2.store;

import java.util.Arrays;
import java.util.Scanner;

/*
Write a Store.java class which`
has a countOfWorkers, name, phoneNumber,
array of product numbers(what kind of product are in store)
where`
countOfWorkers must be in range 2 - 50
name must have at least 3 characters
phoneNumber must have 8 digits, also can not consist of negative digits
 write a method which will sell products
 */
public class Store {
    private int countOfWorkers;
    private String name;
    private String phoneNumber;
    private int arr[]={1, 2, 3, 4};

    public Store() {
    }
    public void sell(){
        System.out.println("Choose what you want to buy ");
        System.out.println("Ice cream --1 \n" + "Fresh -- 2 \n" + "Cake --3 \n" );
        Scanner scanner=new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("Ice cream added to your bag");
                break;
            case 2:
                System.out.println("Fresh added to your bag");
                break;
            case 3:
                System.out.println("Cake added to your bag");
                break;
            default:
                System.out.println("Invalid input");
        }

    }

    @Override
    public String toString() {
        return "Store{" +
                "countOfWorkers=" + countOfWorkers +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }

    public Store(int countOfWorkers, String name, String phoneNumber, int[] arr) {
        this.countOfWorkers = countOfWorkers;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.arr = arr;
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        if (countOfWorkers >= 2 && countOfWorkers <= 50) {
            this.countOfWorkers = countOfWorkers;
        } else {
            System.out.println("Not valid count");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        } else {
            System.out.println("Not valid name");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        int count = 0;
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (!(phoneNumber.charAt(i) >= '0' && phoneNumber.charAt(i) <= '9')) {
                System.out.println("Not valid phone number");
            }
        }
        this.phoneNumber = phoneNumber;
    }

        public int[] getArr () {
            return arr;
        }

        public void setArr (int[]arr){
            this.arr = arr;
        }
    }

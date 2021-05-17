package Week1.day4;

public class Task10 {
    public static void main(String[] args) {
        int randomNumber=((int)(Math.random() * (50)));
        System.out.println(randomNumber);
        boolean flag=false;
        if(randomNumber>-1000 &&  randomNumber<1000 && (randomNumber%3==0 || randomNumber%5==0 )){
            flag=true;
        }
        System.out.println(flag);



    }
}

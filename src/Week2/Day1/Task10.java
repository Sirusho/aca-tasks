package Week2.Day1;

public class Task10 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 32; i <= 122; i++) {
                char c = (char) i;
                System.out.print(c + " ");
                count++;
                if(count%10==0){
                    System.out.println(" ");
            }
        }
    }
}

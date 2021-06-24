package month2.week3;

public class test {
    public static void main(String[] args) {
        String s="A:1:3";
        String[] split = s.split(":");
        for (int i = 0; i <split.length ; i++) {
            System.out.println(split[i]);
        }
    }
}

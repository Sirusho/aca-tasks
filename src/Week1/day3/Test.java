package Week1.day3;

public class Test {
    public static void main(String[] args) {
        String text1 ="Some text";
        String text2= "New text";
        boolean flag;
        //flag=text1.charAt(text1.length()-2)==text2.charAt(text2.length()-2);
        flag=text1==text2;
        System.out.println(flag);
    }
}

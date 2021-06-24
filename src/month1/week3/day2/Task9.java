package month1.week3.day2;
/*
Write a fahrenheitCelsius() function which
prints fahrenheit value  when pass (float celsius, int choice), where choice is the type of fahrenheit`
                             1 , print fahrenheit as int value
                             2 , print fare fahrenheit asa double value
                                , if pass another value print illegal argument
prints celsius when pass (int choice, float fahrenheit)
Example` fahrenheitCelsius(32.0, 1);
Output` 32 fahrenheit is 0 celsius ;
 */
public class Task9 {
    public static void main(String[] args) {
        fahrenheitCelsius(32.0f, 2);

    }
   public static void fahrenheitCelsius(float celsius, int choice){
        if(choice==1){
            System.out.println(celsius + "fahrenheit is " + celsius/33.8 + "celsius");
        }else if(choice==2){
            System.out.println(celsius + "fahrenheit is " + (int)(celsius/33.8) + "celsius");
        }else{
            System.out.println("Invalid input");
        }
   }

}

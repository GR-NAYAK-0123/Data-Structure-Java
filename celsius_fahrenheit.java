import java.util.Scanner;

public class celsius_fahrenheit{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            float celsius = sc.nextFloat();
            float fahrenheit = (float)(celsius * 9.0/5.0) + 32;
            System.out.println(fahrenheit);
        }
    }
}
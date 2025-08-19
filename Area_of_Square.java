import java.util.*;

public class Area_of_Square{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int Area_of_Square = side * side;
        System.out.println("Area of the square is: " + Area_of_Square);
        sc.close();
    }
}
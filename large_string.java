import java.util.Scanner;

public class large_string{
    public static String largest(String str[]){
        String large = str[0];
        for(int i = 1;i<str.length;i++){
            if(large.compareTo(str[i]) < 0){
                large = str[i];
            }
        }
        return large;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            String str[] = {"apple","mango","banana","orange"};
            System.out.println(largest(str));
            sc.close();
        }
    }
}

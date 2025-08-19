import java.util.Scanner;

public class uppercase_toLowercase_bitMan {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            for(char ch = 'A';ch <= 'Z';ch++){
                System.out.println((char)(ch | ' '));
            }
            sc.close();
        }
    }
}

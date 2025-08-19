import java.util.Scanner;

public class palindrome_string {
    public static void checkPalindrome(String word){
        for(int i = 0;i<word.length()/2;i++){
            if(word.charAt(i) != word.charAt(word.length()-i-1)){
                System.out.println("It is not a palindrome word");
                return;
            }
        }
        System.out.println("It is a palindrome word");
    }
    
    // Raja code
    public static void check_palindrome(String word){
        for(int i = 0,j = word.length()-1;i<word.length() && j>=0;i++,j--){
            if(word.charAt(i) != word.charAt(j)){
                System.out.println("It is not a palindrome word");
                return;
            }
        }
        System.out.println("It is a palindome word");
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            String word;
            word = sc.next();
            checkPalindrome(word);
        }
    }
}

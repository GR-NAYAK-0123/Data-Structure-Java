import java.util.Scanner;

public class count_lowerCase_vowels {
    public static int countVowels(String str){
        int count = 0;
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            String str = "Raja Nayak";
            System.out.println(countVowels(str));
            sc.close();
        }
    }
}

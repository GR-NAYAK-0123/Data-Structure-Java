import java.util.Scanner;

public class anagram_string {
    public static void anagram(String str1,String str2){
        int count = 0;
        if(str1.length() == str2.length()){
            for(int i = 0;i<str1.length();i++){
                for(int j = 0;j<str2.length();j++){
                    if(Character.toLowerCase(str1.charAt(i)) == Character.toLowerCase(str2.charAt(j))){
                        count++;
                    }
                }
            }
        }
        if(count == str1.length()){
            System.out.println("This two strings are anagram");
        }
        else{
            System.out.println("Not anagram");
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            String str1;
            str1 = sc.next();
            String str2;
            str2 = sc.next();
            anagram(str1,str2);
        }
    }
}

import java.util.Scanner;

public class find_string_length_recurs {
    public static void length(String str,int i,int count){
        if(i == str.length()){
            System.out.println("Length of the string is: " + count);
            return;
        }
        count++;
        length(str, i+1, count);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            String str = "Raja Nayak";
            length(str, 0, 0);
            sc.close();
        }
    }
}

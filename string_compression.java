import java.util.Scanner;

public class string_compression {
    public static String stringComp(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count.toString());
            }

        }
        return sb.toString();
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            String str = "aaabbcccdd";
            System.out.println(stringComp(str));
            sc.close();
        }
    }
}

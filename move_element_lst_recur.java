import java.util.Scanner;

public class move_element_lst_recur {
    public static void update(String str,char element,int idx,int count,String newstr){
        if(idx == str.length()){
            while(count > 0){
                newstr += element;
                count--;
            }
            System.out.println(newstr);
            return;
        }
        if(str.charAt(idx) == element){
            count++;
            update(str, element, idx+1, count, newstr);
        }
        else{
            newstr += str.charAt(idx);
            update(str, element, idx+1, count, newstr);
        }
    }
    public static void main(String args[]){
       try(Scanner sc = new Scanner(System.in)){
        String str = "axbcxxd";
        update(str, 'x', 0, 0, "");
        sc.close();
       }
    }
}

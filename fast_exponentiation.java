import java.util.Scanner;

public class fast_exponentiation {
    public static int fastExp(int num,int i){
        int ans = 1;

        while(i != 0){
            int bitmask = i & 1;
            if(bitmask == 1){
                ans = num * ans;
            }
            num = num * num;
            i = i>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
          System.out.println(fastExp(2,5));
          sc.close();
        }
    }
}

import java.util.Scanner;

public class friends_pair_recurssion {
    public static int friendsPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }

        // choice -> single
        int fNm1 = friendsPairing(n-1);

        // choice -> pair
        int fNm2 = friendsPairing(n-2);
        int pairways = (n-1) * fNm2;

        //Total ways
        int totways = pairways + fNm1;

        return totways;

    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println(friendsPairing(5));
            sc.close();
        }
    }
}

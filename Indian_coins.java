import java.util.*;

public class Indian_coins {
    public static void main(String args[]){
        int coins[] = {1,2,5,10,20,50,100,200,500,2000};

        int amount = 4001;
        int count = 0;

        Arrays.sort(coins);
        for(int i = coins.length-1;i>=0;i--){
            while(amount >= coins[i]){
                count++;
                amount-=coins[i];
            }
        }
        System.out.println("The minimum number of coins is " + count);
    }
}

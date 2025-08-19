import java.util.Scanner;

public class stock_sell {
    public static int maximum_profit(int price[]){
        int maxprofit = Integer.MIN_VALUE;

        int minBuy[] = new int[price.length-1];
        minBuy[0] = price[0];
        for(int i = 1;i<minBuy.length;i++){
            minBuy[i] = Math.min(minBuy[i-1],price[i]);
        }

        for(int i = 1,j = 0;i<price.length && j<minBuy.length;i++,j++){
            int profit = price[i] - minBuy[j];
            if(profit > maxprofit){
                maxprofit = profit;
            }
        }
        if(maxprofit < 0){
            return 0;
        }

        return maxprofit;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the size: ");
            int n = sc.nextInt();
            int price[] = new int[n];
            for(int i = 0;i<price.length;i++){
                System.out.print("Enter element for index " + i + ":");
                price[i] = sc.nextInt();
            }
            System.out.println("The maximum profit is " + maximum_profit(price));
        }
    }
}

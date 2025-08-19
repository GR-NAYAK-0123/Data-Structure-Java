import java.util.Scanner;

public class trappedRain_water {
    public static int trappingRain_water(int height[]){
        int n = height.length;

        // calculate left max boundary - array

        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i = 1;i<n;i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }

        // calculate right max boundary - array

        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i = n-2;i>=0;i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }

        // loop
        int trappwater = 0;
        for(int i = 0;i<n;i++){
            //  water level = min(rightmax,leftmax)
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            // trapped water = waterlevel - height[i]
            trappwater = trappwater + (waterlevel - height[i]);
        }
        return trappwater;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int height[] = {4,2,0,6,3,2,5};
            System.out.println("The trapped water is " + trappingRain_water(height));
            sc.close();
        }
    }
}

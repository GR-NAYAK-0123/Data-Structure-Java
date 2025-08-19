import java.util.*;

public class TotalCost_gst{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        Float eraser = sc.nextFloat();

        Float Total_cost = (pencil + pen + eraser);
        System.out.println("Total cost is: "+Total_cost);

        float TotalCost_gst = Total_cost + (0.18f * Total_cost);

        System.out.println("The total cost of the item including gst: "+ TotalCost_gst);
        sc.close();
    }
}

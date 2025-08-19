import java.util.*;

public class Max_rectangular_area_histogram {
    public static int maximumArea(int arr[]){
        //Left smaller
        Stack<Integer> s = new Stack<>();
        int left[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            while(!s.isEmpty() && arr[i] <= arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                left[i] = -1;
            }
            else{
                left[i] = s.peek();
            }
            s.push(i);
        }

        //Right smaller
        s = new Stack<>();
        int right[] = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[i] <= arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                right[i] = arr.length;
            }
            else{
                right[i] = s.peek();
            }
            s.push(i);
        }

        // Calculate maximum Area
        int maxArea = 0;
        for(int i = 0;i<arr.length;i++){
            int height = arr[i];
            int width = right[i] - left[i] - 1;
            int area = height * width;
            maxArea = Math.max(area,maxArea);
        }

        return maxArea;
    }
    public static void main(String args[]){
        int arr[] = {2,1,5,6,2,3};
        System.out.println("The maximum rectangle area of the histogram is " + maximumArea(arr));
    }
}

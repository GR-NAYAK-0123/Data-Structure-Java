import java.util.*;

public class NextGreater_element {
    public static void nextGreater(int arr[],int nxtgreater[]){
        Stack<Integer> s = new Stack<>();

        for(int i = arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[i] >= arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtgreater[i] = -1;
            }
            else{
                nxtgreater[i] = arr[s.peek()];
            }

            s.push(i);
        }
    }
    public static void main(String args[]){
        int arr[] = {5,3,6,2,1,4};
        int nxtgreater[] = new int[arr.length];
        nextGreater(arr, nxtgreater);

        for(int i = 0;i<nxtgreater.length;i++){
            System.out.print(nxtgreater[i] + " ");
        }
    }
}

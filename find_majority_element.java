// import java.util.Scanner;
import java.util.Hashtable;


public class find_majority_element {
    int majority(int arr[]){
        int length = arr.length;

        Hashtable<Integer,Integer> map = new Hashtable<Integer,Integer>();
        for(Integer data : arr){
            if(map.containsKey(data)){
                int count = map.get(data);
                map.put(data, count+1);
                if((count+1) > (length/2)){
                    return data;
                }
            } else{
                map.put(data,1);
            }
        }
        return 0;
    }
    public static void main(String args[]){
            int arr[] = {1,3,1,3,1,3,3};   

            find_majority_element obj = new find_majority_element();
            int element = obj.majority(arr);
            System.out.println("The majority element is : "+element);
    }
}

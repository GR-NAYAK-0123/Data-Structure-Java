import java.util.*;

public class Activity_Selection {
    public static void main(String args[]){
        int start[] = {5,8,5,0,3,1};
        int end[] = {9,9,7,6,4,2};

        //Sorting
        int activities[][] = new int[start.length][3];
        for(int i = 0;i<start.length;i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> list = new ArrayList<>();
        int maxAct = 0;
        list.add(activities[0][0]);
        maxAct = 1;
        int endTime = activities[0][2];

        for(int i = 1;i<activities.length;i++){
            if(activities[i][1] >= endTime){
                maxAct++;
                list.add(activities[i][0]);
                endTime = activities[i][2];
            }
        }

        System.out.println("The maximum number of work is : " + maxAct);

        for(int i = 0;i<list.size();i++){
            System.out.print("A"+list.get(i) + " ");
        }
    }
}

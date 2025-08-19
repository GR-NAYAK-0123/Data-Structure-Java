import java.util.*;

public class Job_scheduling {
    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i,int d,int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String args[]){
        //input
        int jobs[][] = {{4,20},{1,10},{1,40},{1,30}};

        //Another way to solve this problem by using objects sorting

        ArrayList<Job> jobsInfo = new ArrayList<>();

        for(int i = 0;i<jobs.length;i++){
            jobsInfo.add(new Job(i,jobs[i][0],jobs[i][1]));
        }

        Collections.sort(jobsInfo,(obj1,obj2) -> obj2.profit - obj1.profit);
        // descending order of profit

        ArrayList<Integer> list = new ArrayList<>();
        int time = 0;
        for(int i = 0;i<jobsInfo.size();i++){
            Job curr = jobsInfo.get(i);
            if(time < curr.deadline){
                time++;
                list.add(curr.id);
            }
        }

        //print jobs
        System.out.println("max jobs is " + list.size());

        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }



        //Normal way for solve this problem
        // Arrays.sort(jobs,Comparator.comparingDouble(o -> o[1]));

        // int profit = 0;
        // int time = 0;

        // for(int i = jobs.length-1;i>=0;i--){
        //     if(time < jobs[i][0]){
        //         profit+=jobs[i][1];
        //         time++;
        //     }
        // }

        // System.out.println("The maximum profit is " + profit);
    }
}

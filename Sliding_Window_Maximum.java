import java.util.*;

public class Sliding_Window_Maximum {
    static class Student implements Comparable<Student>{
        int age;
        int idx;

        public Student(int age,int idx){
            this.age = age;
            this.idx = idx;
        }

        @Override
        public int compareTo(Student s2){
            return s2.age - this.age;  // for descending order
        }
    }
    public static void main(String args[]){
        int age[] = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        PriorityQueue<Student> pq = new PriorityQueue<>();

        int res[] = new int[age.length -k+1];

        for(int i = 0;i<k;i++){
            pq.add(new Student(age[i],i));
        }
        int j = 0;
        res[0] = pq.peek().age;
        j++;
        for(int i = k;i<age.length;i++){
            while(!pq.isEmpty() && pq.peek().idx <= (i-k)){
                pq.remove();
            }
            pq.add(new Student(age[i], i));
            res[j] = pq.peek().age;
            j++;
        }

        for(int i = 0;i<res.length;i++){
            System.out.print(res[i] + " ");
        }
    }
}

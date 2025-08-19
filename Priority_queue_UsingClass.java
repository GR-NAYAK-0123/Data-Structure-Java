import java.util.*;

public class Priority_queue_UsingClass {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name,int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String args[]){
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("Raja", 20));
        pq.add(new Student("Siba", 14));
        pq.add(new Student("Vijay", 11));
        pq.add(new Student("Shivam", 17));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove();
        }

    }
}

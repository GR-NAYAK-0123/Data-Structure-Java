public class OOPS {
    public static void main(String args[]){
        
    }
}

class Animal{
    Animal(){
        System.out.println("Animal constructor called");
    }
}

class Horse extends Animal{
    Horse(){
        super();
        System.out.println("Horse constructor called...");
    }
}

class Calculator{
    int sum(int a,int b){
        return a+b;
    }

    float sum(float a,float b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
}



class Fish extends Animal{
    int flins;

    void swim(){
        System.out.println("Can swim");
    }
}
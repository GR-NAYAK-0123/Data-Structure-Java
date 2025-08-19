import java.util.Scanner;

public class complex_oops {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            Complex s1 = new Complex();
            s1.set(9,6);
            Complex s2 = new Complex();
            s2.set(4,9);
            Complex s3 = new Complex();
            System.out.println(s3.sum(s1,s2));
            sc.close();
        }
    }
}

class Complex{
    int real;
    int img;

    void set(int r,int i){
        this.real = r;
        this.img = i;
    }

    String sum(Complex s1, Complex s2){
        // if(s1.real > s2.real && s1.img > s2.img){
        //     return ((s1.real + s2.real) + "+" + "i" + "(" + (s1.img + s2.img) + ")");
        // }
        // else if(s1.img < s2.img){
        //     return ((s1.real - s2.real) + (s1.img - s2.img) + "i");
        // }
        return ((s1.real + s2.real) + "+" + "i" + "(" + (s1.img + s2.img) + ")");
    }

    String diff(Complex s1, Complex s2){
        // if(s1.real > s2.real && s1.img > s2.img){
        //     return ((s1.real + s2.real) + "+" + "i" + "(" + (s1.img + s2.img) + ")");
        // }
        if(s1.img < s2.img){
            return ((s1.real - s2.real) + "" + (s1.img - s2.img) + "i");
        }
        return ((s1.real - s2.real) + "+" + "i" + "(" + (s1.img - s2.img) + ")");
        // return ((s1.real - s2.real) + "+" + "i" + "(" + (s1.img - s2.img) + ")");
    }

    String prod(Complex s1, Complex s2){
        return ((s1.real * s2.real) + "+" + "i" + "(" + (s1.img * s2.img) + ")");
    }
}
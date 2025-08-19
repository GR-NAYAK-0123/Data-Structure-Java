import java.util.Scanner;

public class Binomial_coefficient {
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }

    public static int binCoeff(int n,int r){
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nMrfact = factorial(n-r);
        int binomialCoeff = nfact/(rfact * nMrfact);
        return binomialCoeff;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            System.out.print("Enter r: ");
            int r = sc.nextInt();
            System.out.println("The binomial coefficient is: " + binCoeff(n,r));
        }
    }
}

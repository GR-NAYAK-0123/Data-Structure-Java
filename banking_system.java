import java.util.Scanner;

public class banking_system {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
        BankAccount b1 = new BankAccount();
        b1.username = "Raja";
        b1.AccNo = 123;
        b1.Balance = 100;
        // b1.createPass("vssut");
        while(true){
            int choice,amount;
            System.out.println("Name - " + b1.username);
            System.out.println("Acc No - " + b1.AccNo);
            System.out.println("1. Withdraw");
            System.out.println("2. deposit");
            System.out.println("3. check Balance");
            System.out.println("4. exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 2 : System.out.println("Enter the amount: ");
                         amount = sc.nextInt();
                         b1.deposit(amount);
                         System.out.println("deposited successfully");
                         break;
                
                case 1 : System.out.println("Enter the amount: ");
                         amount = sc.nextInt();
                         b1.withdraw(amount);
                         System.out.println("Withdraw done");
                         break;
                         
                case 3 : System.out.println("Balance is: " + b1.Balance);
                         break;

                case 4 : return; 
                
                default : System.out.println("Enter valid choice");
            }
        }
    }
    }
    
}

class BankAccount {
    String username;
    // private String password;
    int AccNo;
    float Balance;

    // public void createPass(String newpwd){
    //     password = newpwd;
    // }

    void deposit(float amount){
        Balance = Balance + amount;
    }

    void withdraw(float amount){
        if(amount > Balance){
            System.out.println("Insufficient balance");
        }
        Balance = Balance - amount;
    }
}

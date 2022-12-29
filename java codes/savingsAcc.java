import java.util.Scanner;

public class savingsAcc {
    
    String name;
    int balance;

    public savingsAcc(String holderName, int amount) {
        name = holderName;
        balance = amount;
    }

    public void checkBalance() {
        System.out.println("Your account balance is : " + balance);
    }

    public void withdraw(int amount) {
        balance -= amount;
        System.out.println("You withdrew : " + amount);
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("You deposited : " + amount);
    }

    public String toString() {
        return "Welcome to your account, " + name;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        savingsAcc firstAcc = new savingsAcc("himeno", 2000);
        System.out.println(firstAcc.toString());

        int h = 1;
        
        while (h != 4) {    
        
            System.out.println("Enter your coice : 1 for checkBalance, 2 for withdraw, 3 for deposit and 4 to quit : ");
            int choice = s.nextInt();

            if (choice == 1) {
                firstAcc.checkBalance();
            }
            else if (choice == 2) {
                System.out.println("Enter the amount you want to withdraw : ");
                int amount = s.nextInt();
                firstAcc.withdraw(amount);
            }
            else if (choice == 3) {
                System.out.println("Enter the amount you want to deposit : ");
                int amount = s.nextInt();
                firstAcc.deposit(amount);
            }
            else {
                System.out.println("Thank you for using our account services. Hope you have a nice day.");
            }

            h = choice;
        }
        s.close();
    }
}

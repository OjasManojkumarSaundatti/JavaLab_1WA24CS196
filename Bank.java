import java.util.Scanner;

class account
{
    protected final String accountName;
    protected final double accountNumber;
    protected double balance;

    public account(Scanner sc)
    {
        System.out.print("Enter the 'Name' of the Account holder\n->");
        accountName = sc.nextLine();
        System.out.print("Enter the 'Account Number' of the Account\n->");
        accountNumber = sc.nextDouble();
        System.out.print("Enter the Initial Balance\n->");
        balance = sc.nextDouble();
    }


    void deposit(int depositAmount)
    {
        balance += depositAmount;
        System.out.println(depositAmount + " deposited.\nUpdated balance:" + balance);
    }

    void display() {
        System.out.print("The Name of the Account holder is " + accountName);
        System.out.print("The 'Account Number' of the Account is " + accountNumber);
        System.out.print("Balance is " + balance);
    }
}

class savingsAccount extends account
{
    savingsAccount(Scanner sc)
    {
        super(sc);
    }

    void addInterest(double years)
    {
        double interestRate = 5;
        if(years <= 0)
            System.out.println("No time passed, no interest added.");
        else
        {
            double interest = years * interestRate;
            balance += interest;
            System.out.println(interest + " has been added.\nUpdated Balance:" + balance);
        }
    }

    double withdraw(Scanner sc)
    {
        System.out.print("Enter the amount to be withdrawn:");
        double withdrawal_amount = sc.nextDouble();

        return withdrawal_amount;
    }


}

public class Bank {
    public static void main(String[] args)    {
        Scanner sc = new Scanner(System.in);
        account acc = new account(sc);
    }
}

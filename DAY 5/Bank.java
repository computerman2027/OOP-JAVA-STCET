import java.sql.SQLOutput;
import java.util.Scanner;

class Account {
    String account_no;
    double account_balance;
    public Account(String account_no, double account_balance) {
        this.account_no = account_no;
        this.account_balance = account_balance;
    }

    void deposit(double amt)
    {
        account_balance+=amt;
    }
    void withdraw(double amt)
    {
        account_balance-=amt;
    }
    void displayBalance()
    {
        System.out.println("Account no = "+ account_no + "\nAccount balance = "+account_balance);
    }
}

class Savings_Account extends Account
{
    final double interest;

    public Savings_Account(String account_no, double account_balance, double roi) {
        super(account_no, account_balance);
        interest=roi;
    }

    void withdraw(double amt)
    {
        if(account_balance-1000>=amt)
        {
            account_balance-=amt;
            System.out.println("Balance withdraw successful");
            displayBalance();
        }
        else
        {
            System.out.println("Low balance. cannot be withdrawn");
        }
    }

    void calcInterest()
    {
        double interestamt= (interest/100)*account_balance;
        System.out.println("interst = "+ interestamt);
        account_balance+=interestamt;
        displayBalance();
    }
}
class Current_Account extends Account
{
    double overdraftLimit;

    public Current_Account(String account_no, double account_balance, double overdraftLimit) {
        super(account_no, account_balance);
        this.overdraftLimit=overdraftLimit;
    }
    void withdraw(double amt)
    {
        if ((account_balance-amt>=0) ||
                (account_balance-amt<0 && ((account_balance-amt)*(-1))<=overdraftLimit))
        {
            account_balance-=amt;
            System.out.println("Balance withdraw successful");
            displayBalance();
        }
        else
        {
            System.out.println("Cannot be withdrawn");
        }
    }
    void displayBalance()
    {
        System.out.println("Account no = "+ account_no +
                "\nAccount balance = "+account_balance+
                "\nOver draft amount limit = "+ overdraftLimit+
                "\nOver draft amount taken = "+ ((account_balance<0)?account_balance*(-1):0));
    }
}


public class Bank
{
    public static void main(String[] args) {
        String accno="";
        double accbalance=0;
        Savings_Account sa=null;
        Current_Account ca=null;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nType of account\n" +
                "1. Savings Account\n" +
                "2. Current Account\n" +
                "Enter your Choice");

        int choice = sc.nextInt();
        if(choice>0 && choice<3)
        {
            System.out.println("Enter Account no : ");
            accno = sc.next();
            System.out.println("Enter account balance : ");
            accbalance = sc.nextDouble();
        }
        switch (choice)
        {
            case 1:
                System.out.println("Enter Rate of interest : ");
                double roi = sc.nextDouble();
                sa = new Savings_Account(accno,accbalance,roi);
                break;
            case 2:
                System.out.println("Enter overdraft limit : ");
                double odlmt = sc.nextDouble();
                ca = new Current_Account(accno,accbalance,odlmt);
                break;
            default:
                System.out.println("Exiting");
                System.exit(0);
        }

        while (true)
        {
            System.out.println("\nMENU\n" +
                    "1. DEPOSIT\n" +
                    "2. WITHDRAW\n" +
                    "3. DISPLAY BALANCE\n" +
                    "4. INTEREST FOR SAVINGS ACCOUNT ONLY\n" +
                    "5. EXIT\n" +
                    "ENTER YOUR CHOICE");
            int choice2 = sc.nextInt();

            switch (choice2)
            {
                case 1:
                    System.out.println("Enter amount to Deposit : ");
                    double amtDeposit= sc.nextDouble();
                    if(choice ==1)
                    {
                        sa.deposit(amtDeposit);
                    }
                    else
                    {
                        ca.deposit(amtDeposit);
                    }
                    break;
                case 2:
                    System.out.println("Enter amount to Withdraw : ");
                    double amtWithdraw= sc.nextDouble();
                    if(choice ==1)
                    {
                        sa.withdraw(amtWithdraw);
                    }
                    else
                    {
                        ca.withdraw(amtWithdraw);
                    }
                    break;
                case 3:
                    if(choice ==1)
                    {
                        sa.displayBalance();
                    }
                    else
                    {
                        ca.displayBalance();
                    }
                    break;
                case 4:
                    if(choice==1)
                    {
                        sa.calcInterest();
                    }
                    else
                    {
                        System.out.println("NOT APPLICABLE FOR CURRENT ACCOUNT");
                    }
                    break;
                case 5:
                    System.out.println("Exiting");
                    System.exit(0);
                default :
                    System.out.println("INVALID  INPUT");

            }
        }
    }
}
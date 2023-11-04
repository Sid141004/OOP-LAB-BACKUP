import java.util.Scanner;
class account 
{
    String customer,acc_type;
    int acc_no;
    private int balance = 0;
    Scanner sc = new Scanner(System.in);
    account()
    {
        System.out.println("ENTER THE CUSTOMER NAME :");
        customer = sc.nextLine();
        System.out.println("ENTER THE ACCOUNT NUMBER :");
        acc_no = sc.nextInt();
        System.out.println("ENTER THE ACCOUNT TYPE : (C / S)");
        acc_type = sc.nextLine(1);
        balance = 0;
    }
    void disp()
    {
        System.out.println("THE BALANCE IS Rs."+ balance);
    }
    void deposit(int x)
    {
        balance += x;
        System.out.println("DEPOSITED SUCCESFULLY");
    }
    void withdraw(int x)
    {
        if(x>balance)
        {
            System.out.println("LOW BALANCE");
        }
        else 
        {
            balance -= x;
        }
    }
    void minbal()
    {
        int minbal = 100;
        if(balance < minbal )
    }
}
class current extends account 
{
    
}
public class account {
    
}

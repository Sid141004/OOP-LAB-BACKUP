import java.util.Scanner;
class bankdemo
{
    int get_int(int amt)
    {
        System.out.println("ENTER INTREST : ");
        Scanner sc = new Scanner(System.in);
        int interest = sc.nextInt();
        int f = (interest*amt)/100;
        return f;
    }
}
class sbi extends bankdemo
{
    int get_int(int amt)
    {
        int f = (8*amt)/100;
        return f;
    }
}
class icici extends bankdemo
{
    int get_int(int amt)
    {
        return (7*amt)/100;
    }
}
class axis extends bankdemo
{
    int get_int(int amt)
    {
        return (9*amt)/100;
    }
}

public class bank {
    public static void main(String[] args)
    {
        bankdemo b1 = new bankdemo();
        sbi b2 = new sbi();
        icici b3 = new icici();
        axis b4 = new axis();
        System.out.println("YOUR amount :" + b1.get_int(100000));
        System.out.println("SBI amount :" + b2.get_int(100000));
        System.out.println("ICICI amount :" + b3.get_int(100000));
        System.out.println("AXIS amount :" + b4.get_int(100000));
        bankdemo ref;
        //dynamic method dispatch
        ref = b4;
        System.out.println("DMD amount :" + ref.get_int(100000)); 
    }
}

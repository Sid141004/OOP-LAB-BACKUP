
import java.util.Scanner;
class lab23 
{
    public static void main(String args[])
    {
        int a , b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n1 = sc.nextInt();
        a = n1 >> 1 ;
        b = n1 << 1 ;
        System.out.println(" the multiplied number is " +b );
        System.out.println("the divided number is "+a);

    }
    
}

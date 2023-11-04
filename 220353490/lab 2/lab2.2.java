//int to byte, char to int, double to byte, double to int
import java.util.Scanner;
class lab225454 
{
    public static void main( String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer : ");
        int n = sc.nextInt();
        System.out.println("enter the double number : ");
        double d = sc.nextDouble();
        System.out.println("enter a charecter : ");
        char c = sc.next().charAt(0);
        byte n1 = (byte) n;
        int n2;
        n2 = (int) c;
        byte n3 = (byte) d;
        int n4 = (int) d;
        System.out.println(n1+"\n"); 
        System.out.println(n2 +"\n"); 
        System.out.println(n3+"\n"); 
        System.out.println(n4+"\n"); 

    }
    
}

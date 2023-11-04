import java.util.Scanner;
class lab27 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 3 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = a>b ? a : b ;
        int t = c>k ? c : k ;
        System.out.println(" the largest number is " + t);

    }
    
}

import java.util.Scanner;
class lab26
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 2 numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n1 = (a << 2) + (b >> 2);
        boolean n2 = (b > 0);
        int n3 = (a + b * 100) / 10;
        int n4 = (a&b);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);

    }
    
}

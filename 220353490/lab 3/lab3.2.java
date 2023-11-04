import java.util.Scanner;
class lab32 {
    public static void main(String args[])
    { 
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the length of the rectangle : ");
       int l = sc.nextInt();
       System.out.println("enter the breadth of the rectangle  : ");
       int b = sc.nextInt();
       System.out.println("the area is --- > "+ l*b);
       System.out.println("the perimeter is --- > " + 2*(l+b));
    }
    
}

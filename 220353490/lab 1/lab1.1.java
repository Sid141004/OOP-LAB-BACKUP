//Write a Java program to find area and circumference of a rectangle.
import java.util.Scanner;
class Hello
{
  public static void main(String args[]) 
{    

    System.out.println("enter the length : \t"); 
    Scanner sc1=new Scanner(System.in);
     int a=sc1.nextInt();

     System.out.println("enter the breadth : \t");
     Scanner sc2=new Scanner(System.in);
     int b=sc2.nextInt();

     int c=a*b;
     int d=2*(a+b);
     System.out.println("area of the rectangle is " +c);
     System.out.println("the perimeter of the rectangle is " +d);
}

}
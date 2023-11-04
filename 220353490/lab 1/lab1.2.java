import java.util.Scanner;
class lab12
{
  public static void main(String args[]) 
{
    int a ;
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the year : ");
    int b= sc.nextInt();
    if (b%4!=0 || b%100==0 || b%400!=0)
    {
        System.out.println("it is not a leap year");
    }
    else 
    {
        System.out.println("it is a leap year");
    }
}

}
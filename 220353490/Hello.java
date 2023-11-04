import java.util.Scanner;
class Hello
{
  public static void main(String args[]) 
{    
    int i;
    int a = 1;
    int j;
    System.out.print("enter the numbver :");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); 
    for(i=10;i>0;i--)
    {
        System.out.println(n+" X " +i+"="+(n*i));
    }
}

}
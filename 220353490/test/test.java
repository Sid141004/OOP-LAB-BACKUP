/* WAP TO CREATE TEST CLASS HAVING THE FOLLOWING PRE METHODS - 
 * 1)SUM WITH 2 INTEGER PARAMETERS
 * 2)SUM WITH 1 INTEGER ARRAY 
 * 3)SUM WITH 2 DOUBLE VALUES
 * THE ABOVE SUM FUNCTIONS PERFORM THE SUMMATION OF INPUT PARAMATERS AND DISPLAYS SUM VALUE
 * main function must demonstrate the working of above 3 functions . 3rd function pass command line arguements .
 */

import java.net.SocketPermission;
import java.util.Scanner;
import java.util.scanner;
 class test {
    int sum = 0;
    void sum(int i,int j)
    {
        sum = 0 ;
        sum = i + j;
    }
    void sum(int a[])
    {
        sum = 0;
        for(int i=0;i<5;i++)
        {
            sum+=a[i];
        }
    }
    void sum(double i ,double j )
    {
        sum =  0;
        sum =  i + j;
    }
}
class testdemo 
{
    public static void main(String args[])
    {
       test ob1 = new test();
        int a , b ;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER 1ST NUMBER :");
        a = sc.nextInt();
        System.out.println("ENTER SECOND NUMBER :");
        b=sc.nextInt();
        ob1.sum(a,b);
        System.out.println("SUM IS " + ob1.sum);
        int x[] = new int[5];
        System.out.println(("ENTER THE VALUES OF THE ARRAY :"));
        for(int i=0; i<5 ; i++)
        {
                x[i] = sc.nextInt();
        }
        ob1.sum(x);
        System.out.println(" SUM IS " + ob1.sum);
        double c = 10;
        double d = 20;        
        ob1.sum(c,d);
        System.out.println("SUM IS "+ ob1.sum);
    }
}

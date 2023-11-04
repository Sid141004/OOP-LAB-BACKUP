import java.util.Scanner;
class lab21 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        boolean isleap = false  ;
        System.out.println("enter the year : ");
        int n = sc.nextInt();
        if(n%4==0)
        {
            if(n%400==0 || n%100 == 0)
            {
                isleap = false ;
                System.out.println(n+ "\t is not a leap year ");
            }
            else 
            {
                isleap = true ;
                System.out.println(n+ "\t is a leap year ");
            }
        }
        else 
        {
            isleap = false  ;
            System.out.println(n+ "\t is not a leap year ");
        }
        
    }

    
}

import java.util.Scanner;
class lab31
{
    public static void main(String args[])
    {
        Scanner ch = new Scanner(System.in);
        System.out.println("enter the number : ");
        int i = ch.nextInt();
        int x=i;
        int sum = 0 , temp =0;
        while(x>0)
        {
            temp = x%10;
            sum += temp*temp*temp;
            x/=10;
        }
        if(sum==i)
        {
            System.out.println(sum + "it is an armstrong number");
        }
        else 
        {
            System.out.println(sum + "it is not");
        }

    }
}
import java.util.Scanner;
public class Armstrong_number 
{
    public static void main(Strings args[]{
        
    })
    int no,sum=0;
    Armstrong(int x)
    {
        this.no=x;
    }
    while(no/10!=0)
    {
        int temp = no%10;
        sum += temp*temp*temp;
        no /= 10;

    }
    sum += no*no*no ;
    int func(){
       if(sum==no)
       {
        return 1;
       }
       else
       {
        return 0;
       }
    }
}

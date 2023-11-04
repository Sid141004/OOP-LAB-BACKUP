import java.util.Scanner;
class Armstrong_number 
{
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
public static void main(Strings args[])
{
    Scanner ch = new Scanner(System.in);
    int i= in.nextInt();
    Armstrong_number ob = new Armstrong_number(i);
    System.out.println(ob.func);

}
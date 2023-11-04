import java.util.Scanner;
class lab34 
{
    public static void main(String args[])
    {
        int m =5, n= 50;
        int i,flag=0,count=2;
        for(i=m ; i<n; i++)
        {
            count =2;
            while(count!= m)
            {
               if(i%count==0)
               {
                  flag = 1;
                  break;
               }
               else 
               {
                  flag = 0; 
                  count++;
               }

            }
            if(flag==0)
            {
                System.out.println(i);
            }
        }
    }  
}

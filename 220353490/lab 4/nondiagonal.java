import java.util.*;
class nondiagonal {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n,m;
        System.out.println("enter n and m");
        n=sc.nextInt();
        m=sc.nextInt();
        int[][] a = new int[300][400];
        int sum=0;
        int pdsum=0;
        int sdsum=0;
        int finalsum=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
             pdsum=pdsum+a[i][i];             
        }
        for(i=0;i<n;i++)
        {
            for(j=m;j>=0;j--)
            {
                sdsum=+a[i][j];
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                sum=sum+a[i][j];
            }
        }
        finalsum=sum-(pdsum+sdsum);
        System.out.println("the sum of non diagonal elements" + finalsum);
    }
}

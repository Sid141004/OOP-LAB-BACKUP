import java.util.Scanner;
class lab351
{
    public static void main(String args[])
    {
        int a[] = {1,2,5,4,5,6};
        int no = 5,count=0;

        for (int i : a)
        {
            if (i==no)
            {
                System.out.println("a["+ count +"]");
                System.out.println(i);
            }
            count++;
            i++;
        }
    }
}

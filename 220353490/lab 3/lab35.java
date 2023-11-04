import java.util.Scanner;
class lab34
{
    public static void main(String args[])
    {
        int a[] = {1,2,3,4,5,6};
        int no = 3;

        for (int i : a)
        {
            if (i==no)
            {
                System.out.println("a["+ i +"]");
                System.out.println(i);
            }
            i++;
        }
    }
}
import java.util.Scanner;
class lab25 
{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char ch1;
        do {
            System.out.println("enter the first number,operator,second number : ");
            float  a = sc.nextFloat();
            float  b = sc.nextFloat();
            char c = sc.next().charAt(0);
            switch(c)
            {
                case '+':
                {
                    float n = a + b;10
                    System.out.println("the answer is " + n);
                }
                case '-':
                {
                    float n = a - b;
                    System.out.println("the answer is " + n);
                }
                case 'x':
                {
                    float n = a*b;
                    System.out.println("the answer is " + n);
                }
                case '/':
                {
                    float n = a/b;
                    System.out.println("the answer is " + n);
                }
            }
            System.out.println("do another(y/n) ? ");
            ch1 = sc.next().charAt(0);
        }while(ch1!= 'n' && ch1== 'y');

    }
    
}

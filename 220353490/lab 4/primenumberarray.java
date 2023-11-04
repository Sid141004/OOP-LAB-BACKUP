/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.*;
public class primenumberarray
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the number of elements");
        n=sc.nextInt();
        int flag=0;
        int[] a;
        a= new int[100];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
           for(int j=2;j<a[i]/2;j++)
           {
               if(a[i]%j!=0)
                   flag=1;
               break;
           }
        }
        if(flag!=0)
        {
            System.out.println("prime numbers are: "+ i);
        }
    }
}

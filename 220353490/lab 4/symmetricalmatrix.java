/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.*;
public class symmetricalmatrix {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n,m;
        System.out.println("enter n and m");
        n=sc.nextInt();
        m=sc.nextInt();
        int[][] a = new int[300][400];
       
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
            
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(a[i][j]==a[j][i])
                    System.out.println("symmetric");
                else
                    System.out.println("not symmetric");
            }
        }
    }
}
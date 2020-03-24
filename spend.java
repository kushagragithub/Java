import java.io.*;
import java.util.*;
import java.lang.Math.*;
import static java.lang.Math.ceil;
import java.lang.String;
import java.util.Arrays.*; 

class spend {
    public static void main(String args[]) {
        int i,n,k,l,j,p,maxx,ln1,ln2;
        
         //1,2,5
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the budget :");
        n=sc.nextInt();
        System.out.println("Enter the no. of 1st items :");
        k=sc.nextInt();
        System.out.println("Enter the no. of 2nd items :");
        l=sc.nextInt(); 
        System.out.println("Enter the list of 1st items :");
        int[] arr;   //2,4,8     10
        arr = new int [100];
        int [] arr1;
        arr1 = new int [99];
         int[] arr2;
         arr2=new int [100];
        for(i=0;i<k;i++)
            {
                 arr[i]=sc.nextInt();
            }
        System.out.println("Enter the list of 2nd items :");
        for(j=0;l<j;j++)
            {
                 arr1[j]=sc.nextInt();
            }
        ln1 = arr.length;
        ln2 = arr1.length;
        maxx = Math.max(ln1,ln2);
        
       for (p=0;p<maxx;p++)
       {
           arr2[p]= arr1[p]+arr[p];
       }
       for (p=0;p<maxx;p++)
       {
           System.out.print(arr2[p]);
       }
        
    }
}
        
            
       

        
         

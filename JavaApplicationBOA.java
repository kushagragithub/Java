/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationboa;
import java.util.*;
import java.lang.Math.*;
import static java.lang.Math.ceil;
import java.lang.String;
import java.util.Arrays.*; 
/*
 *
 * @author Kushagra
 */
public class JavaApplicationBOA {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        // TODO code application logic here
        String str;
        str = "hey i am a java";
        System.out.println(str.charAt(0));
        System.out.println(ceil(4.3));
        //System.out.println();
    }
*/
public static int main(String[] args) {
   /* int n,i;
       Scanner sc= new Scanner(System.in);
    System.out.println("Give the size of array");
     n=sc.nextInt();
     int [] arr= new int[n];
    System.out.println("Enter the Array");
    for(i=0;i<n;i++)
    {
      arr[i]=sc.nextInt(); 
    }
    System.out.println("Displays the array");
    for(i=0;i<n;i++)
    {
    System.out.print(arr[i]+" ");
    }
 */ 
/*
    String number;
    int i,o,len,n;
    n = 0;
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter the number");
    number=scan.nextLine();
    len=number.length();
    for(i=0;i<len;i++)
        {
            o=n%10;
            System.out.print(0 +" ");
            n=n/10;

        }*/    
    
    /*
     int i,n,j,ar;
     int [] arr = new int[100];
     System.out.println("Enter the size of array");
     Scanner input= new Scanner (System.in);
     n=input.nextInt();
     for(i=0;i<n;++i)
     {
         arr[i]=input.nextInt();
     }
      for(i=0;i<n;++i)
      {
          for(j=i+1;j<n;++j)
          {
              if(arr[i]>arr[j])
              {
                  ar=arr[i];
                  arr[i]=arr[j];
                  arr[j]=ar;
              }
          }
          
          for(i=0;i<n;i++)
          {
              System.out.println(arr[i]);
          }*/
   
  /*  TestClass Object= new TestClass();
    Object.name="Kushagra";
    Object.function();
    
    */
  String sstring,sstring1;
  Scanner sc=new Scanner (System.in);
   System.out.println("Enter the two strings:"); 
  sstring =sc.nextLine();
   sstring1=sc.nextLine();
   int ln1 ,ln2,big,i,counter = 0;
   ln1=sstring.length();
   ln2=sstring1.length();
   big = Math.max(ln1,ln2);
   
   for(i=0;i<big;i++)
   {
       if(sstring.charAt(i)==sstring1.charAt(i)){
           counter++;
           return counter;
       }
   }
    return 0;
  

}}



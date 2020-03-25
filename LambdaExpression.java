
package pkg25march;
import java.util.*;
import java.io.*;
public class LambdaExpression {
    public static void main (String args[])
    {
        int x=10;
        Functionalinterface
        f1 = (int a1,double d1)->{
            System.out.println(2*x);
            System.out.println("This is an expansion of abstract method : " +a1);
            int prod = x*a1;
            System.out.println("The product of numbers " +x+" and " +a1+" is "+ prod );
        };
        f1.abstractMethod(2,6.4);
        f1.nonAbstractMethod();
       
    }
}

package javaapplication4;

import java.util.Scanner;
import java .io.*;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class javaapplication4 {
 
    public static void main(String[] args) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String name[];int size = 0,i;
        try {
            size=Integer.parseInt(br.readLine());
        } catch (IOException ex) {
            Logger.getLogger(javaapplication4.class.getName()).log(Level.SEVERE, null, ex);
        }
       name=new String[size];
       for(i=0;i<size;i++)
       {
           name[i]=br.readLine();
       }
       List<String> list= Arrays.asList(name);
       list.forEach((li) -> {
           System.out.print(li+"");
        });
    }
}
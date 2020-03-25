/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapp;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author Kushagra
 */
public class Mapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<Integer,String> map = new HashMap <Integer,String>();
        Scanner in = new Scanner (System.in);
        int num = in.nextInt();
        for(int i =0 ; i<num; i++){
            int n = in.nextInt();
            String f = in.nextLine();
            map.put(n,f);
           // System.out.println(map.put(n,f));
        }
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
            
            /*
        map.put(1,"aaa");
        map.put(2, "value");
        map.put(3, "value2");
        map.put(4, "valu4");
        
        for (Map.Entry m:map.entrySet()){
            
            System.out.println();
        }
        */
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Kushagra
 */
public class Sett {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Set <String> s1 = new TreeSet();
        s1.add("me");
        s1.add("meme");
        s1.add("meme2");
        s1.add("meme3");
        s1.add("meme5");
        
        
        Iterator <String> setIterator = s1.iterator();
        while(setIterator.hasNext()){
            System.out.println(setIterator.next());
        }
        System.out.println("-----------------------------------");
        for(String s:s1)
        {
            System.out.println(s1);
        }
        System.out.println("-----------------------------------");
        
        Set<String> s2 = new HashSet<String>();
        //Set <Integer> s3 = new LinkedHashSet<>();
        
        s2.add("me");
        s2.add("meme");
        s2.add("meme2");
        s2.add("meme3");
        s2.add("meme5");
        
        for(String h:s2)
        {
            System.out.println(s2);
        }
    }
    
}

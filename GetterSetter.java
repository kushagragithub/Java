/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getter.setter;

import java.util.Iterator;
import java.util.ArrayList;

/**
 *
 * @author Kushagra
 */
public class GetterSetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        setget obj = new setget();
        obj.setNumber (10);
        int num = obj.getNumber() ;
        
          obj.setNumber1 (10);
        int num1 = obj.getNumber1() ;
        
          obj.setNumber2 (15);
        int num2 = obj.getNumber2() ;
        
          obj.setNumber3 (20);
        int num3 = obj.getNumber3() ;
       // Iterator  me = obj.Iterator ();
        System.out.println(obj.getNumber()+obj.getNumber1()+obj.getNumber2()+obj.getNumber3());
    }
    
}

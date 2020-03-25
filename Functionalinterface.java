/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg25march;

/**
 *
 * @author Kushagra
 */
public interface Functionalinterface {
    void abstractMethod (int a, double b);
    
    default void nonAbstractMethod(){
        System.out.println("In non abstract Method");
    }
}

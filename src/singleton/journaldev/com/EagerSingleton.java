/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.journaldev.com;

/**
 *
 * @author Brian
 */
public class EagerSingleton {
    
    private static final EagerSingleton instance =
            new EagerSingleton();
    
    // private constructor to avoid client side use
    private  EagerSingleton(){
        System.out.println("Only one of me is created.   EagerSingleton.");
    }
    
    public static EagerSingleton getInstance(){
        return instance;
    }
    
}

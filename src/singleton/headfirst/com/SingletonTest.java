/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.headfirst.com;

/**
 *
 * @author Brian
 */
public class SingletonTest {
    public static void main(String[] args) {
        // This call can't run because of a private method.
        // Singleton s = new Singleton();
        
        // This is how you'll call it.
        Singleton.getInstance();
        
        // Calling it the second time does nothing.
        Singleton.getInstance();
        
        
        
    }
    
}

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
public class SingletonTests {
    public static void main(String[] args) {
        
        EagerSingleton.getInstance();
        EagerSingleton.getInstance();
        
    }
    
}

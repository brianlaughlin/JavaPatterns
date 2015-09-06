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
public class Singleton {
    private static Singleton uniqueInstance;
    
    private Singleton(){
        System.out.println("A Singleton class has been formed. ");
    }
    
    public static Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    
}

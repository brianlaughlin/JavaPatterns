/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.java.app;

/**
 *
 * @author brian
 */
public class SingleObject {
    
    //create an object of singleobject
    private static final SingleObject instance = new SingleObject();
    
    //make constructor private this this class can't be instantiated.
    private SingleObject(){}
    
    // Get the only object available
    public static SingleObject getInstance(){
        return instance;
    }
    
    public void showMessage(){
        System.out.println("Hello world - can only see me once.");
    }
    
}

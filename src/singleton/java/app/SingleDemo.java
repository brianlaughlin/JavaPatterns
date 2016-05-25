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
public class SingleDemo {

    public static void main(String[] args) {
        SingleObject so = SingleObject.getInstance();

        so.showMessage();
        System.out.println("ID: " + so.toString());
        
        SingleObject so2 = SingleObject.getInstance();

        so2.showMessage();

        System.out.println("ID: " + so2.toString());
        
    }
    
}

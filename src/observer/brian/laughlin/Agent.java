/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.brian.laughlin;

/**
 *
 * @author Brian
 */
public class Agent implements IObserver{

    String name = "Brian the Agent";
    
    @Override
    public void update(String status) {
        System.out.println(name + " says thank you for updating." +
                "\nI now know the house is " + status);
     
    }
    
}

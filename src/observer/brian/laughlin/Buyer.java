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
public class Buyer implements IObserver{

    @Override
    public void update(String status) {
        System.out.println("The buyer now knows that the house is " + status);
    }
    
}

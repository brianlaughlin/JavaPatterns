/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.headfirst.com;

/**
 *
 * @author Brian
 */
public class FlyWithWings implements IFlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    
    }
    
}

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
public class MiniDuckSimulator {
    
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        System.out.println("I am " + mallard.getClass().getSimpleName());
        mallard.performFly();
        mallard.performQuack();
        
        
        Duck model = new ModelDuck();
        System.out.println("I'm a " + model.getClass().getSimpleName());
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        
    }
    
}

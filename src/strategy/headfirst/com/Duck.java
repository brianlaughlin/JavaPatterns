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
public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;
    
    public Duck(){
        
    }
    
    public abstract void display();
    
    public void performFly(){
        flyBehavior.fly();
    }
    
    public void performQuack(){
        quackBehavior.quack();
    }
    
    public void swim(){
            System.out.println("All ducks float, even decoys!");
    }
    
    public void setFlyBehavior(IFlyBehavior fb){
        flyBehavior = fb;
    }
    
    public void setQuackBehavior(IQuackBehavior qb){
        quackBehavior = qb;
    }
    
}

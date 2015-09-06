/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.tutorialspoint.com;

/**
 *
 * @author Brian
 */
public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;
    
    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }
    
    public void draw(){
        decoratedShape.draw();
    }
    
}

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
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    
    @Override
    public void draw(){
        decoratedShape.draw();
        setBoarder(decoratedShape);
    }

    private void setBoarder(Shape decoratedShape) {
        System.out.println("Border color is red.");
    }
    
}

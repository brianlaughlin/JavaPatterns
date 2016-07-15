/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade.java.app;

import javax.sound.midi.Receiver;

/**
 *
 * @author brian
 */
public class ShapeMaker {
    private final Shape circle;
    private final Shape rectangle;
    private final Shape square;
    
    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    
    public void drawCircle(){
        circle.draw();
    }
    
    public void drawSquare(){
        square.draw();
    }
    
    public void drawRectangle(){
        rectangle.draw();
    }
    
}

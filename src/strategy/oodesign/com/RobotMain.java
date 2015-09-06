/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.oodesign.com;

/**
 *
 * @author Brian
 */
public class RobotMain {

    public static void main(String[] args) {
        Robot r1 = new Robot("Big Robot Bully");
        Robot r2 = new Robot("Scaredy Cat");
        Robot r3 = new Robot("Minding MiOwnBiz");

        r1.setBehavior(new AggressiveBehavior());
        r2.setBehavior(new DefensiveBehavior());
        r3.setBehavior(new NormalBehavior());

        r1.move();
        r2.move();
        r3.move();

        System.out.println("\r\nNew behaviours: "
                + "\r\n\t'Big Robot Bully' gets really scared"
                + "\r\n\t, 'Scaredy Cat' becomes really mad because"
                + "it's always attacked by other robots"
                + "\r\n\t and Minding MiOwnBiz keeps its calm.\r\n");

        r1.setBehavior(new DefensiveBehavior());
        r2.setBehavior(new AggressiveBehavior());

        r1.move();
        r2.move();
        r3.move();

    }

}

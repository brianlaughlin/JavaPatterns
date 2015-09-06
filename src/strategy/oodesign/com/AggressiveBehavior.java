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
public class AggressiveBehavior implements IBehavior{

    @Override
    public int moveCommand() {
        System.out.println("\tAgressive Behavior: if you find another robot attack it.");
        return 1;
    }
    
}

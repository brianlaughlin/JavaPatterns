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
public class DefensiveBehavior implements IBehavior{

    @Override
    public int moveCommand() {
        
        System.out.println("\tDefensive Behavior: if find another robert run from it.");
        return -1;
    }
    
}

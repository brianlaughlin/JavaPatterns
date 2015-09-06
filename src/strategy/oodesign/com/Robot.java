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
public class Robot {
    private IBehavior behavior;
    private String name;
    
    public Robot(String name){
        
        this.name = name;
    }
    
    public void setBehavior(IBehavior behavior){
        
        this.behavior = behavior;
    }

    /**
     * @return the behavior
     */
    public IBehavior getBehavior() {
        return behavior;
    }
    
    public void move(){
        
        System.out.println(this.getName() + ": Based on current position" +
                    " the behavior object decided the next move:");
        int command = behavior.moveCommand();
        // ... send the command to mechanisms
        System.out.println("\tThe result return by behavior object " +
                             "is sent to the movement mechanisms " + 
                             "for the robot '" + this.getName() + "'");
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    
    
}

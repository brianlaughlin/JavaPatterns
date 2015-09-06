/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.alvinalexander.com;

/**
 *
 * @author Brian
 */
public class DogFactory {
    public static Dog getDog(String criteria){
        if(criteria.equalsIgnoreCase("small"))
            return new Poodle();
        else if(criteria.equals("big"))
            return new Rottweiler();
        else if(criteria.equals("cute"))
            return new Shipo();
        
        return null;
        
    }
    
}

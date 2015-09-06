/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.brian.laughlin;

/**
 *
 * @author Brian
 */
public class PropertyUpdateTester {
    
    public static void main(String[] args) {
        Agent agent = new Agent();
        Buyer buyer = new Buyer();
        Website site = new Website();
        
        Property property = new Property("777 Christian Lane");
        
        // add interested parties
        property.observers.add(site);
        property.observers.add(buyer);
        property.observers.add(agent);
        
        //update
        property.notifyObserver();
        
        printSeperator();
        
        // Change status
        property.setStatus(PropertyStatus.PENDING);
        property.notifyObserver();
        
        printSeperator();
        
        // remove Buyer & Agent
        property.observers.remove(agent);
        property.observers.remove(buyer);
        
        // Change Status
        property.setStatus(PropertyStatus.SOLD);
        property.notifyObserver();
        
    }

    private static void printSeperator() {
        System.out.println("--------------------------------------------------------\n\n");
    
    }
    
}

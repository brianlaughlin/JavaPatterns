/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.brian.laughlin;

/**
 *
 * @author brian
 */
public class NosyNeighbor implements IObserver{
    
    private String name;

    public NosyNeighbor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
        
    @Override
    public void update(String status) {
        System.out.println("Nosy Neighbor " + getName() + " knows the status of the house and tells everyone.");
    }
    
    
}

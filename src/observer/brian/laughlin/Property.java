/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.brian.laughlin;

import java.util.ArrayList;

/**
 *
 * @author Brian
 */
public class Property implements ISubject{
    
    private PropertyStatus status;
    String address;
    ArrayList<IObserver> observers;
    
    public Property(String address){
        this.observers = new ArrayList<>();
        this.address = address;
        this.status = status.ACTIVE;
    }

    /**
     * @return the status
     */
    public PropertyStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(PropertyStatus status) {
        this.status = status;
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver ob : observers){
            System.out.println("Property Status Has Changed for : " + address);
            ob.update(this.getStatus().toString());
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.javarevisited.com;

import java.util.ArrayList;

/**
 *
 * @author Brian
 */
public class Loan implements Subject{
    
    private ArrayList<Observer> observers = new ArrayList<>();
    private String type;
    private float interest;
    private String bank;
    
    public Loan(String type, float interest, String bank){
        this.type = type;
        this.interest = interest;
        this.bank = bank;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer ob : observers) {
            System.out.println("Notifying Observers on change in Loan interest rate");
            ob.update(this.getInterest());
        }
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @return the interest
     */
    public float getInterest() {
        return interest;
    }

    /**
     * @return the bank
     */
    public String getBank() {
        return bank;
    }

    /**
     * @param interest the interest to set
     */
    public void setInterest(float interest) {
        this.interest = interest;
    }
    
}

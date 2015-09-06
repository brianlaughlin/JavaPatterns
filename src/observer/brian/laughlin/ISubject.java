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
public interface ISubject {
    
    public void addObserver(IObserver observer);
    
    public void removeObserver(IObserver observer);
    
    public void notifyObserver();
    
}

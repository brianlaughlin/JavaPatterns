/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.journaldev.com;

/**
 *
 * @author Brian
 */
public class Volt {
    
    private int volts;
    
    public Volt(int v){
        this.volts = v;
    }

    /**
     * @return the volts
     */
    public int getVolts() {
        return volts;
    }

    /**
     * @param volts the volts to set
     */
    public void setVolts(int volts) {
        this.volts = volts;
    }
    
}

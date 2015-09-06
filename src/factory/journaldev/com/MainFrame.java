/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.journaldev.com;

/**
 *
 * @author Brian
 */
public class MainFrame extends Server {

    private String ram;
    private String hdd;
    private String cpu;

    /**
     *
     * @param ram
     * @param hdd
     * @param cpu
     */
   // @Override
    public MainFrame(String ram, String hdd, String cpu) {
        super(ram, hdd, cpu);
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

}

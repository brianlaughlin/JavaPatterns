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
public class TestFactory {
    
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "4 GB", "500 GB", "2.4 Ghz");
        Computer server = ComputerFactory.getComputer("server", "16 GB", "2 TB", "3.2 Ghz");
        Computer mainFrame = 
                ComputerFactory.getComputer("mainframe", "1 TB", "100 TB", "2 FLOPS");
        
        System.out.println("Facotry PC Config:: " + pc);
        System.out.println("Factory Server Config:: " +server);
        System.out.println("Factor MainFrame Config:: " +mainFrame);
                
    }
}

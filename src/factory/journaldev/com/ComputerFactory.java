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
public class ComputerFactory {
    
    public static Computer getComputer(String type, String ram, String hdd,
                    String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type)) 
                                return new Server(ram, hdd, cpu);
        else if("mainframe".equalsIgnoreCase(type))
                                return new MainFrame(ram, hdd, cpu);
        
        return null;
    }
    
}

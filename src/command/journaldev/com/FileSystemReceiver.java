/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.journaldev.com;

/**
 *
 * @author Brian
 */
public interface FileSystemReceiver {
    
    void openFile();
    void writeFile();
    void closeFile();
    
}

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
public class UnixFileSystemReceiver implements FileSystemReceiver{

    @Override
    public void openFile() {
        System.out.println("Open file in Unix");
    }

    @Override
    public void writeFile() {
        System.out.println("Write file in Unix");
    }

    @Override
    public void closeFile() {
        System.out.println("Close file in Unix");
    }
    
    
}

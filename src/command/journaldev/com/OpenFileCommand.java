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
public class OpenFileCommand implements Command{
    private FileSystemReceiver FileSystem;
    
    public OpenFileCommand(FileSystemReceiver fs){
        this.FileSystem = fs;
        
    }
    
    @Override
    public void execute() {
        // open command is forwarding the request to OpenFile method
        this.FileSystem.openFile();
    }
    
}

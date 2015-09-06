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
public class WriteFileCommand implements Command{
    private FileSystemReceiver fileSystem;
    
    public WriteFileCommand(FileSystemReceiver fs){
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.writeFile();
    }
    
}

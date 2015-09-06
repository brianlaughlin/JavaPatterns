/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.journaldev.com;

import java.nio.file.FileSystem;

/**
 *
 * @author Brian
 */
public class CloseFileCommand implements Command{
    private FileSystemReceiver fileSystem;
    
    public CloseFileCommand(FileSystemReceiver fs){
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }
    
}

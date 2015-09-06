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
public class FileSystemClient {
    
    public static void main(String[] args) {
        // Create receier object

        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();
        
        // creating command and associating with receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);
        
        // creating invoker and associating with Command
        FileInvolker file = new FileInvolker(openFileCommand);
        
        // perform action
        file.execute();
        
        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvolker(writeFileCommand);
        file.execute();
        
        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvolker(closeFileCommand);
        file.execute();
        
                
    }
    
}

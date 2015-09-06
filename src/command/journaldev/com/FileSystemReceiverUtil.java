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
public class FileSystemReceiverUtil {
    
    public static FileSystemReceiver getUnderlyingFileSystem(){
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is: "+osName);
        if(osName.contains("Windows")){
            return new WindowsFileSystemReceiver();
        } else{
            return new UnixFileSystemReceiver();
        }
    }
    
}

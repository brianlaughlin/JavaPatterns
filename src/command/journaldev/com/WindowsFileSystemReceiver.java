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
public class WindowsFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("Opens file in Windows");
    }

    @Override
    public void writeFile() {
        System.out.println("Writes file in Windows.");
    }

    @Override
    public void closeFile() {
        System.out.println("Closes a file in Windows");
    }

}

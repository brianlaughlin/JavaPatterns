/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter.tutorialspoint.com;

/**
 *
 * @author Brian
 */
public class vlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    
    }
    
}

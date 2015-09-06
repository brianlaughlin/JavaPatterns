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
public class mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVLC(String fileName) {
        // do nothing
    
    }

    @Override
    public void playMp4(String fileName) {
        playVLC("Playing the mp4 file. Name: " + fileName);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaplayer;

import java.awt.BorderLayout;
import javax.swing.*;
import java.lang.*;
import javax.swing.SwingUtilities;

/**
 *
 * @author emd0008
 */
public class MediaPlayer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                MediaPlayerGUI gui = new MediaPlayerGUI();
                gui.setVisible(true);
            }
        });
    }  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacman.UI;

import Grafiikat.Pacman;
import Grafiikat.Suunta;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author eamiller
 */
public class Nappaimistonkuuntelija implements KeyListener{
    private Pacman pacman;
    private Component component;

    public Nappaimistonkuuntelija(Pacman pacman) {
        this.pacman = pacman;
    }
    
    
    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            pacman.setSuunta(Suunta.VASEN);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            pacman.setSuunta(Suunta.OIKEA);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            pacman.setSuunta(Suunta.YLOS);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            pacman.setSuunta(Suunta.ALAS);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

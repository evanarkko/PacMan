/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacman.UI;

import Grafiikat.Piirtoalusta;
import pacman.pelioliot.Pacman;
import pacman.pelioliot.Suunta;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import pacman.pelioliot.Miina;

/**
 *
 * @author eamiller
 */
public class Nappaimistonkuuntelija implements KeyListener {

    private Piirtoalusta piirtoalusta;
    private Pacman pacman;
    private Component component;

    public Nappaimistonkuuntelija(Pacman pacman, Piirtoalusta piirtoalusta) {
        this.pacman = pacman;
        this.piirtoalusta = piirtoalusta;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == 'x') {
            piirtoalusta.PacmanAmpuu();
        }
        if (e.getKeyChar() == 'z') {
            piirtoalusta.lisaaMiina(new Miina(piirtoalusta.getPacman().getX(), piirtoalusta.getPacman().getY()));
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == 'x') {
            piirtoalusta.PacmanAmpuu();
        }

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

}

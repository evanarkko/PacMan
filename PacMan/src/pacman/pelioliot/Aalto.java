/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman.pelioliot;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author eamiller
 */
public class Aalto extends Hahmo {

    public Aalto(int x, int y, Suunta suunta) {
        super(x, y);
        this.suunta = suunta;
    }

    @Override
    public void liiku() {
        if (suunta == Suunta.YLOS) {
            setY(getY() - 10);
        }
        if (suunta == Suunta.ALAS) {
            setY(getY() + 10);
        }
        if (suunta == Suunta.VASEN) {
            setX(getX() - 10);
        }
        if (suunta == Suunta.OIKEA) {
            setX(getX() + 10);
        }
    }

    @Override
    public void luo(Graphics g) {
        g.setColor(Color.black);
        if (suunta == Suunta.YLOS) {
            g.fillRect(x + 10, y, 40, 2);
            g.drawLine(x + 10, y, x, y+10);
            g.drawLine(x + 50, y, x+60, y+10);
        }
        if (suunta == Suunta.ALAS) {
            g.fillRect(x + 10, y + 60, 40, 2);
            g.drawLine(x + 10, y + 60, x, y+50);
            g.drawLine(x + 50, y + 60, x + 60, y+50);
        }
        if (suunta == Suunta.VASEN) {
            g.fillRect(x, y + 10, 2, 40);
            g.drawLine(x, y + 10, x+10, y);
            g.drawLine(x, y + 50, x+10, y+60);
        }
        if (suunta == Suunta.OIKEA) {
            g.fillRect(x + 60, y + 10, 2, 40);
            g.drawLine(x + 60, y + 10, x+50, y);
            g.drawLine(x + 60, y + 50, x+50, y + 60);
        }
    }

}

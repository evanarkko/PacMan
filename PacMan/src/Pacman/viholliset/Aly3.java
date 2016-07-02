/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacman.viholliset;

import pacman.pelioliot.Pacman;
import pacman.pelioliot.Suunta;
import pacman.pelioliot.Vihollinen;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author eamiller
 */
public class Aly3 extends Vihollinen {

    int x;
    int y;

    public Aly3(int x, int y, int nopeus) {
        super(x, y, nopeus);
    }
    public Aly3(int x, int y) {
        super(x, y, 3);
    }

    @Override
    public void luo(Graphics g) {
        super.luo(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.red);
        g.drawString("3", getX()+20, getY()+35);
    }
    
    
    
    

    public void liiku(int kohdeX, int kohdeY) {
        if (getX() < kohdeX - 40) {
            setX(getX() + nopeus);
            setSuunta(Suunta.OIKEA);
        } else if (getX() > kohdeX + 40) {
            setX(getX() - nopeus);
            setSuunta(Suunta.VASEN);
        } else if (getY() < kohdeY) {
            setY(getY() + nopeus);
            setSuunta(Suunta.ALAS);
        } else if (getY() > kohdeY) {
            setY(getY() - nopeus);
            setSuunta(Suunta.YLOS);
        }
    }

}

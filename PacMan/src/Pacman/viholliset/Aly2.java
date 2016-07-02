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
public class Aly2 extends Vihollinen {

    int x;
    int y;

    public Aly2(int x, int y, int nopeus) {
        super(x, y, nopeus);
    }
    public Aly2(int x, int y) {
        super(x, y, 2);
    }

    @Override
    public void luo(Graphics g) {
        super.luo(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.green);
        g.drawString("2", getX()+20, getY()+35);
    }
    
    
    
    

    public void liiku(int kohdeX, int kohdeY) {
        
            
        if (getY() < kohdeY - 15) {
            setY(getY() + nopeus);
            setSuunta(Suunta.ALAS);
        } else if (getY() > kohdeY + 15) {
            setY(getY() - nopeus);
            setSuunta(Suunta.YLOS);
        }else if (getX() < kohdeX) {
            setX(getX() + nopeus);
            setSuunta(Suunta.OIKEA);
        } else if (getX() > kohdeX) {
            setX(getX() - nopeus);
            setSuunta(Suunta.VASEN);
        }
    }

}

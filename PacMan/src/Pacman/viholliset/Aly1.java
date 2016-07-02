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
public class Aly1 extends Vihollinen {
    int x;
    int y;

    
    public Aly1(int x, int y, int nopeus) {
        super(x, y, nopeus);
    }
    public Aly1(int x, int y) {
        super(x, y, 1);
    }

    @Override
    public void luo(Graphics g) {
        super.luo(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.yellow);
        g.drawString("1", getX()+20, getY()+35);
    }
    
    
    
    
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman.pelioliot.pisteet;

import pacman.pelioliot.Hahmo;
import java.awt.Color;
import java.awt.Graphics;
import pacman.pelioliot.Hahmo;

/**
 *
 * @author eamiller
 */
public class PistePallo extends Hahmo {
    String nimi;
    int varilaskuri = 0;
    int arvo = 5;

    public PistePallo(int x, int y) {
        super(x, y);
    }

    public int getArvo() {
        return arvo;
    }
    
    

    @Override
    public int getX() {
        return x;//To change body of generated methods, choose Tools | Templates.
    }

    public String getNimi() {
        return nimi;
    }
    
    

    @Override
    public int getY() {
        return y; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void luo(Graphics g) {
            varilaskuri++;
            
            g.setColor(new Color((float) Math.random(),0,0));
            g.fillOval(x, y, 10, 10);
            g.setColor(Color.white);
            g.drawOval(x, y, 10, 10);
    }

}

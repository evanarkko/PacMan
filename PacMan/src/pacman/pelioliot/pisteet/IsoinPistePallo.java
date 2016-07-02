/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman.pelioliot.pisteet;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author eamiller
 */
public class IsoinPistePallo extends PistePallo {
    
    public IsoinPistePallo(int x, int y) {
        super(x, y);
        arvo = 20;
    }
    
    @Override
    public void luo(Graphics g) {
            varilaskuri++;
            
            g.setColor(new Color(0,0,(float) Math.random()));
            g.fillOval(x, y, 30, 10);
            g.setColor(Color.white);
            g.drawOval(x, y, 30, 10);
    }
    
}

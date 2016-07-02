/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman.pelioliot.pisteet;

import pacman.pelioliot.pisteet.PistePallo;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author eamiller
 */
public class IsoPistePallo extends PistePallo{
    
    public IsoPistePallo(int x, int y) {
        super(x, y);
        nimi = "elama";
        arvo = 10;
    }

    @Override
    public void luo(Graphics g) {
            varilaskuri++;
            g.setColor(new Color((float) ((float) Math.random() * 0.5 + 0.5),(float) ((float) Math.random() * 0.5 + 0.5),0));
            g.fillOval(x, y, 10, 20);
            g.setColor(Color.white);
            g.drawOval(x, y, 10, 20);
    }
    
    
    
}

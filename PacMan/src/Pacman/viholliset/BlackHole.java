/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacman.viholliset;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import pacman.pelioliot.Suunta;
import pacman.pelioliot.Vihollinen;

/**
 *
 * @author eamiller
 */
public class BlackHole extends Vihollinen {

    public BlackHole(int x, int y, int nopeus) {
        super(x, y, nopeus);
        health = 10000;
    }

    @Override
    public void luo(Graphics g) {
        g.setColor(Color.black);
        g.fillOval(x, y, 100, 100);
        g.fillRect(x-6, y+24, 120, 20);
        g.setColor(Color.white);
        g.drawString(""+this.health, x+20, y+20);
        g.setFont(new Font("Lobster Two", Font.PLAIN, 16)); 
        
        g.drawString("MOTHAFUCKING", x - 7, y+40);
        g.drawString("BLACK HOLE", x+5, y+70);
        
        
    }

    public void liiku(int kohdeX, int kohdeY) {
        int etaisyysX = Math.abs(this.x - kohdeX);
        int etaisyysY = Math.abs(this.y - kohdeY);

        if (etaisyysX > etaisyysY) {
            if (this.x < kohdeX) {
                setX(getX() + nopeus);
            } else {
                setX(getX() - nopeus);
            }
        }else{
           if (this.y < kohdeY) {
                setY(getY() + nopeus);
            } else {
                setY(getY() - nopeus);
            } 
        }
    }

}

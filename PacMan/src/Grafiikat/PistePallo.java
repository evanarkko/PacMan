/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafiikat;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author eamiller
 */
public class PistePallo extends Hahmo {

    int varilaskuri = 0;

    public PistePallo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getY() {
        return y; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void luo(Graphics g) {
        if (maalataan) {
            varilaskuri++;
            g.setColor(Color.GREEN);
            g.fill3DRect(x, y, 30, 30, true);
        }
    }

}

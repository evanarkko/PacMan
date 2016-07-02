/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacman.viholliset;

import java.awt.Color;
import java.awt.Graphics;
import pacman.pelioliot.Vihollinen;

/**
 *
 * @author eamiller
 */
public class VartijaY extends Vihollinen{
    
    public VartijaY(int x, int y) {
        super(x, y, 0);
        this.health = 200;
    }

    @Override
    public void luo(Graphics g) {
        g.setColor(Color.white);
        g.drawRect(getX(), getY(), 40, 60);
        
        g.setColor(Color.black);
        g.fillOval(getX() - 3, getY() - 30, 45, 35);
        
        
        g.setColor(Color.red);
        g.fillOval(getX() + 1, getY() - 25, 15, 7);
        g.fillOval(getX() + 19, getY() - 25, 15, 7);
        
        
        g.setColor(new Color(250, 0, 158));
        g.fillOval(getX() - 15, getY(), 30, 30);
        g.fillOval(getX() + 25, getY(), 30, 30);
        
        g.fillOval(getX() - 10, getY() + 35, 30, 30);
        g.fillOval(getX() + 20, getY() + 35, 30, 30);
    }

    @Override
    public void liiku(int kohdeX, int kohdeY) {
        if(kohdeY < this.getY()){
            setY(getY() - 10);
        }else if(kohdeY > this.getY()){
            setY(getY() + 10);
        }
    }
    
    
    
    
    
}

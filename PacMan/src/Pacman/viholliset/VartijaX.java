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
public class VartijaX extends Vihollinen{

    public VartijaX(int x, int y) {
        super(x, y, 0);
        this.health = 200;
    }
    
    

    @Override
    public void luo(Graphics g) {
        g.setColor(Color.white);
        g.drawRect(getX(), getY(), 60, 40);
        
        g.setColor(Color.black);
        g.fillOval(getX() + 3, getY() - 30, 45, 35);
        
        
        g.setColor(Color.red);
        g.fillOval(getX() + 7, getY() - 25, 15, 7);
        g.fillOval(getX() + 25, getY() - 25, 15, 7);
        
        
        g.setColor(new Color(150, 0, 230));
        g.fillOval(getX() - 15, getY() - 10, 25, 23);
        g.fillOval(getX() + 45, getY() - 10, 25, 23);
        
        g.fillOval(getX() - 10, getY() + 25, 27, 23);
        g.fillOval(getX() + 40, getY() + 25, 27, 23);
    }

    @Override
    public void liiku(int kohdeX, int kohdeY) {
        if(kohdeX < this.getX()){
            setX(getX() - 10);
        }else if(kohdeX > this.getX()){
            setX(getX() + 10);
        }
    }
    
    
    
    
    
}

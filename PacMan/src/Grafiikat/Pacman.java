/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafiikat;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyListener;

/**
 *
 * @author eamiller
 */
public class Pacman extends Hahmo{
    int x;
    int y;
    Suunta suunta;

    public Pacman(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setSuunta(Suunta suunta) {
        this.suunta = suunta;
    }
    
    
    
    @Override
    public void luo (Graphics g){
        g.drawOval(x, y, 61, 61);
        g.drawOval(x, y, 60, 60);
        g.drawOval(x, y, 59, 59);
        g.setColor(Color.yellow);
        g.fillOval(x,y,60,60);
        
    }

    @Override
    public void liiku() {
        if(suunta == Suunta.YLOS){
            this.y -= 5;
        }
        if(suunta == Suunta.ALAS){
            this.y += 5;
        }
        if(suunta == Suunta.VASEN){
            this.x -= 5;
        }
        if(suunta == Suunta.OIKEA){
            this.x += 5;
        }
    }
    
    
}

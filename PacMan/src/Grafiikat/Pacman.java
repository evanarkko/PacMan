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
public class Pacman extends Hahmo {

    int x;
    int y;
    Suunta suunta;
    boolean suuAuki;

    public Pacman(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setSuunta(Suunta suunta) {
        this.suunta = suunta;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;//To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public void luo(Graphics g) {
        if(x > maX){
            x = -25;
        }if(y > maxY){
            y = -35;
        }if(x < -45){
            x = maX;
        }if(y < -35){
            y = maxY - 35;
        }
        g.setColor(Color.BLACK);
        g.drawOval(x, y, 61, 61);
        g.drawOval(x, y, 60, 60);
        g.drawOval(x, y, 59, 59);
        g.setColor(Color.yellow);
        g.fillOval(x, y, 60, 60);
        g.setColor(Color.BLUE);
        if (this.suunta == Suunta.OIKEA) {
            luoOikealle(g);
        } else if (this.suunta == Suunta.VASEN) {
            luoVasemmalle(g);
        } else if (this.suunta == Suunta.ALAS) {
            luoAlas(g);
        } else if (this.suunta == Suunta.YLOS) {
            luoYlos(g);
        }

    }

    private void luoOikealle(Graphics g) {
        g.fillOval(this.x + 35, this.y + 10, 10, 10);
        g.setColor(Color.BLACK);
        if (this.suuAuki) {
            int[] suuX = {x + 30, x + 60, x + 60};
            int[] suuY = {y + 30, y + 20, y + 40};
            g.fillPolygon(suuX, suuY, 3);
        } else {

        }
    }

    private void luoVasemmalle(Graphics g) {
        g.fillOval(this.x + 17, this.y + 10, 10, 10);
        g.setColor(Color.BLACK);
        if (this.suuAuki) {
            int[] suuX = {x + 30, x + 60, x + 60};
            int[] suuY = {y + 30, y + 20, y + 40};
            g.fillPolygon(suuX, suuY, 3);
        } else {

        }
    }

    private void luoAlas(Graphics g) {
        g.fillOval(this.x + 37, this.y + 40, 10, 10);
        g.fillOval(this.x + 15, this.y + 40, 10, 10);
        g.setColor(Color.BLACK);
        if (this.suuAuki) {
            int[] suuX = {x + 30, x + 60, x + 60};
            int[] suuY = {y + 30, y + 20, y + 40};
            g.fillPolygon(suuX, suuY, 3);
        } else {

        }
    }

    private void luoYlos(Graphics g) {
        g.fillOval(this.x + 37, this.y + 10, 10, 10);
        g.fillOval(this.x + 15, this.y + 10, 10, 10);
        g.setColor(Color.BLACK);
        if (this.suuAuki) {
            int[] suuX = {x + 30, x + 60, x + 60};
            int[] suuY = {y + 30, y + 20, y + 40};
            g.fillPolygon(suuX, suuY, 3);
        } else {

        }
    }

    @Override
    public void liiku() {
        if (suunta == Suunta.YLOS) {
            this.y -= 5;
        }
        if (suunta == Suunta.ALAS) {
            this.y += 5;
        }
        if (suunta == Suunta.VASEN) {
            this.x -= 5;
        }
        if (suunta == Suunta.OIKEA) {
            this.x += 5;
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman.pelioliot;

import java.awt.Graphics;

/**
 *
 * @author eamiller
 */
public abstract class Hahmo {

    public int x;
    public int y;
    int maX = 1310;
    int maxY = 730;
    Suunta suunta;
    boolean maalataan = true;

    public Hahmo(int x, int y) {
        this.x = x;
        this.y = y;
        this.suunta = Suunta.VASEN;
    }
    
    public void setSuunta(Suunta suunta) {
        this.suunta = suunta;
    }

    public void luo(Graphics g) {

    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    

    public void liiku() {

    }

    public void setMaalataan(boolean maalataan) {
        this.maalataan = maalataan;
    }
    
    
    
    public boolean equals(Hahmo h){
        if(this.x == h.getX() && this.y == h.getY()){
            return true;
        }
        return false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    

}

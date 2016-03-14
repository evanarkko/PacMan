/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafiikat;

import java.awt.Graphics;

/**
 *
 * @author eamiller
 */
public abstract class Hahmo {

    int x;
    int y;
    int maX = 1310;
    int maxY = 730;
    private Suunta suunta;
    boolean maalataan = true;
    
    

    public void luo(Graphics g) {

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

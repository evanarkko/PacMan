/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman.pelioliot;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author eamiller
 */
public class Miina extends Hahmo {

    private int laskuri;
    private int ylaRaja;
    private boolean laskuriKaynnissa;

    public Miina(int x, int y) {
        super(x, y);
        this.laskuri = 0;
        this.ylaRaja = 1000;
        this.laskuriKaynnissa = false;
    }

    public void kaynnistaLaskuri() {
        this.laskuriKaynnissa = true;
    }

    public int getLaskuri() {
        return laskuri;
    }

    public void setYlaRaja(int laskurinYlaRaja) {
        this.ylaRaja = laskurinYlaRaja;
    }
    
    public void laskuriEtenee(){
        if(laskuriKaynnissa){
            laskuri++;
        }
    }

    @Override
    public void luo(Graphics g) {
        if (!laskuriKaynnissa) {
            g.setColor(Color.gray);
            g.fillOval(x, y, 20, 20);
            g.setColor(Color.red);
            g.fillOval(x + 5, y + 5, 8, 8);
        }else{
            if(laskuri < 2){
                luoRajahdysVaihe1(g);
            }else if(laskuri < 4){
                luoRajahdysVaihe2(g);
            }else if(laskuri < 6){
                luoRajahdysVaihe3(g);
            }else {
                luoRajahdysVaihe4(g);
            }
        }

    }

    private void luoRajahdysVaihe1(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(x, y, 25, 25);
        g.setColor(Color.red);
        g.fillOval(x + 7, y + 7, 12, 12);
    }

    private void luoRajahdysVaihe4(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(x, y, 44, 44);
        g.setColor(Color.red);
        g.fillOval(x + 13, y + 13, 22, 22);
    }

    private void luoRajahdysVaihe2(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(x, y, 32, 32);
        g.setColor(Color.red);
        g.fillOval(x + 9, y + 9, 16, 16);
    }

    private void luoRajahdysVaihe3(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(x, y, 37, 37);
        g.setColor(Color.red);
        g.fillOval(x +11, y + 11, 19, 19);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author eamiller
 */
public class Pelaaja {
    String nimi;
    int elamia;
    int pisteet;
    int elamakynnys;

    public Pelaaja(String nimi) {
        this.nimi = nimi;
        pisteet = 0;
        elamia = 2;
        elamakynnys = 1000;
    }

    public int getPisteet() {
        return pisteet;
    }
    
    public void lisaaPisteita(int pisteita){
        pisteet += pisteita;
        if(pisteet >= elamakynnys){
            lisaaElama();
            elamakynnys += 1000;
        }
    }
    
    public void menetaElama(){
        this.elamia--;
    }
    
    public void lisaaElama(){
        this.elamia++;
    }

    public int getElamia() {
        return elamia;
    }
    
    
    
    public void luoNakyma(Graphics g){
        g.setFont(new Font("TimesRoman", Font.PLAIN, 30)); 
        g.setColor(Color.white);
        g.drawString("Pelaaja1: " + nimi, 1000, 60);
        g.drawString("Pisteet: " + pisteet, 1000, 95);
        g.drawString("Lives: " + elamia, 1000, 130);
    }
    
    
    
}

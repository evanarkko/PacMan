/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman.main;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author eamiller
 */
public class Pelaaja {
    String nimi;
    int pisteet;

    public Pelaaja(String nimi) {
        this.nimi = nimi;
        pisteet = 0;
    }

    public int getPisteet() {
        return pisteet;
    }
    
    public void lisaaPisteita(int pisteita){
        pisteet += pisteita;
    }
    
    public void luoNakyma(Graphics g){
        g.setColor(Color.BLACK);
        g.drawString(nimi, 1000, 60);
        g.drawString("Pisteet: " + pisteet, 1000, 80);
    }
    
    
    
}

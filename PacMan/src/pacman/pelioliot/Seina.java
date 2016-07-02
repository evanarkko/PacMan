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
public class Seina extends Hahmo{
    
    public Seina(int x, int y) {
        super(x, y);
    }

    @Override
    public void luo(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(x, y, 25, 25);
        g.setColor(Color.blue);
        g.drawRect(x, y, 25, 25);
    }

    
    
    
    
}

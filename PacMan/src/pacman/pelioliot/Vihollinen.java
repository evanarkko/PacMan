package pacman.pelioliot;

import pacman.pelioliot.Hahmo;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author eamiller
 */
public class Vihollinen extends Hahmo {
    public int health;
    private boolean kuollut;
    public int nopeus;

    public Vihollinen(int x, int y, int nopeus) {
        super(x, y);
        this.nopeus = nopeus;
        health = 50;
        kuollut = false;
    }

    @Override
    public void luo(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRoundRect(x, y, 50, 50, 10, 10);
        g.setColor(Color.red);
        for (int i = 0; i < 45; i += 9) {
            g.fillOval(x + 2 + i, y + 45, 10, 10);
        }
        g.setColor(Color.white);
        if (this.suunta == Suunta.VASEN) {
            luoKatseVasemmalle(g);
        }else{
            luoKatseOikealle(g);
        }
        g.setColor(Color.MAGENTA);
        g.fillArc(x + 25, y - 5, 30, 30, 0, 90);
        g.fillArc(x - 6, y - 5, 30, 30, 90, 90);
        
        g.setColor(Color.black);
        luoNakyma(g);
    }

    private void luoKatseVasemmalle(Graphics g) {
        g.fillOval(x + 5, y + 5, 10, 10);
        g.fillOval(x + 25, y + 5, 10, 10);
    }
    
    private void luoKatseOikealle(Graphics g){
        g.fillOval(x + 34, y + 5, 10, 10);
        g.fillOval(x + 14, y + 5, 10, 10);
    }
    
    public void otaDamagea(int damage){
        this.health -= damage;
        if(this.health <= 0){
            kuollut = true;
        }
    }
    
    private void luoNakyma(Graphics g){
        g.setFont(new Font("TimesRoman", Font.PLAIN, 20)); 
        g.setColor(Color.BLACK);
        g.drawString(""+health, x+10, y-10);
    }
    
    public void liiku(int kohdeX, int kohdeY) {
        if (getX() < kohdeX - 15) {
            setX(getX() + nopeus);
            setSuunta(Suunta.OIKEA);
        } else if (getX() > kohdeX + 15) {
            setX(getX() - nopeus);
            setSuunta(Suunta.VASEN);
        } else if (getY() < kohdeY) {
            setY(getY() + nopeus);
            setSuunta(Suunta.ALAS);
        } else if (getY() > kohdeY) {
            setY(getY() - nopeus);
            setSuunta(Suunta.YLOS);
        }
    }

    public boolean isKuollut() {
        return kuollut;
    }
    
    

}

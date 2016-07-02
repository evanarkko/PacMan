/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman.pelioliot;

import pacman.pelioliot.Hahmo;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyListener;

/**
 *
 * @author eamiller
 */
public class Pacman extends Hahmo {

    private boolean liikkuminenYlosSallittu;
    private boolean liikkuminenAlasSallittu;
    private boolean liikkuminenOikealleSallittu;
    private boolean liikkuminenVasemmalleSallittu;
    private int health;
    Suunta suunta;
    boolean kuollut;
    boolean suuAuki;

    public Pacman(int x, int y) {
        super(x, y);
        this.liikkuminenYlosSallittu = true;
        this.liikkuminenAlasSallittu = true;
        this.liikkuminenOikealleSallittu = true;
        this.liikkuminenVasemmalleSallittu = true;
        health = 100;
        kuollut = false;
    }

    public void setSuunta(Suunta suunta) {
        this.suunta = suunta;
    }

    public Suunta getSuunta() {
        return suunta;
    }

    public void setLiikkuminenAlasSallittu(boolean liikkuminenAlasSallittu) {
        this.liikkuminenAlasSallittu = liikkuminenAlasSallittu;
    }

    public void setLiikkuminenOikealleSallittu(boolean liikkuminenOikealleSallittu) {
        this.liikkuminenOikealleSallittu = liikkuminenOikealleSallittu;
    }

    public void setLiikkuminenVasemmalleSallittu(boolean liikkuminenVasemmalleSallittu) {
        this.liikkuminenVasemmalleSallittu = liikkuminenVasemmalleSallittu;
    }

    public void setLiikkuminenYlosSallittu(boolean liikkuminenYlosSallittu) {
        this.liikkuminenYlosSallittu = liikkuminenYlosSallittu;
    }

    public void otaDamagea(int damage) {
        this.health -= damage;
        if(health <= 0) kuollut = true;
    }
    
    public void revive(){
        this.health = 100;
        kuollut = false;
    }

    public boolean isKuollut() {
        return kuollut;
    }
    
    

    @Override
    public void luo(Graphics g) {
        if (x > maX) {
            x = -25;
        }
        if (y > maxY) {
            y = -35;
        }
        if (x < -45) {
            x = maX;
        }
        if (y < -35) {
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
        luoHealthBar(g);
    }

    private void luoHealthBar(Graphics g) {
        double osuus = (this.health / 100) * 50;
        g.setColor(Color.red);
        g.fillRect(x + 5, y - 10, 50, 5);
        g.setColor(Color.green);
        if (health < 10) {
            if(health > 0) g.fillRect(x + 5, y - 10, 5, 5);
        }else if (health < 20) {
            g.fillRect(x + 5, y - 10, 10, 5);
        }else if (health < 30) {
            g.fillRect(x + 5, y - 10, 15, 5);
        }else if(health < 40) {
            g.fillRect(x + 5, y - 10, 20, 5);
        }else if (health < 50) {
            g.fillRect(x + 5, y - 10, 25, 5);
        } else if(health < 60) {
            g.fillRect(x + 5, y - 10, 30, 5);
        }else if (health < 70) {
            g.fillRect(x + 5, y - 10, 35, 5);
        } else if(health < 80) {
            g.fillRect(x + 5, y - 10, 40, 5);
        }else if (health < 90) {
            g.fillRect(x + 5, y - 10, 45, 5);
        } else {
            g.fillRect(x + 5, y - 10, 50, 5);
        }

        g.setColor(Color.black);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 15));
        g.drawString("" + health, x + 14, y + 36);
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
            if (liikkuminenYlosSallittu) {
                setY(getY() - 5);
            }
        }
        if (suunta == Suunta.ALAS) {
            if (liikkuminenAlasSallittu) {
                setY(getY() + 5);
            }
        }
        if (suunta == Suunta.VASEN) {
            if (liikkuminenVasemmalleSallittu) {
                setX(getX() - 5);
            }
        }
        if (suunta == Suunta.OIKEA) {
            if (liikkuminenOikealleSallittu) {
                setX(getX() + 5);
            }
        }
    }

}

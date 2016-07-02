package Grafiikat;

import java.awt.Color;
import java.awt.Font;
import pacman.pelioliot.Pacman;
import pacman.pelioliot.Hahmo;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import pacman.main.Pelaaja;
import pacman.pelioliot.Aalto;
import pacman.pelioliot.pisteet.IsoPistePallo;
import pacman.pelioliot.Miina;
import pacman.pelioliot.pisteet.PistePallo;
import pacman.pelioliot.Seina;
import pacman.pelioliot.Suunta;
import pacman.pelioliot.Vihollinen;

/**
 *
 * @author eamiller
 */
public class Piirtoalusta extends JPanel {

    private boolean paused;
    private boolean gameOver;
    private int level;
    private Pacman pacman;
    private Pelaaja pelaaja;
    private ArrayList<PistePallo> pistepallot;
    private ArrayList<Vihollinen> viholliset;
    private ArrayList<Hahmo> seinat;
    private ArrayList<Hahmo> aallot;
    private ArrayList<Hahmo> elamat;
    private ArrayList<Miina> miinat;
    private IsoPistePallo elamapallo;

    public Piirtoalusta() {
        viholliset = new ArrayList<Vihollinen>();
        pistepallot = new ArrayList<>();
        this.seinat = new ArrayList<Hahmo>();
        this.aallot = new ArrayList<Hahmo>();
        this.elamat = new ArrayList<Hahmo>();
        this.miinat = new ArrayList<>();
        gameOver = false;
        paused = false;
        pelaaja = null;
        elamapallo = null;
    }

    public void setElamapallo(IsoPistePallo elamapallo) {
        this.elamapallo = elamapallo;
    }

    public IsoPistePallo getElamapallo() {
        return elamapallo;
    }
    
    

    public void lisaaSeina(Seina seina) {
        seinat.add(seina);
    }

    public void lisaaPacman(Pacman p) {
        this.pacman = p;

    }

    public void lisaaMiina(Miina miina) {
        if (this.miinat.size() < 5) {
            this.miinat.add(miina);
        }
    }

    public ArrayList<Miina> getMiinat() {
        return miinat;
    }

    public void lisaaVihollinen(Vihollinen h) {
        viholliset.add(h);
    }

    public void lisaaPistepallo(PistePallo h) {
        pistepallot.add(h);
    }

    public ArrayList<Vihollinen> getViholliset() {
        return viholliset;
    }

    public ArrayList<Hahmo> getAallot() {
        return aallot;
    }

    public ArrayList<PistePallo> getPistepallot() {
        return pistepallot;
    }

    public Pelaaja getPelaaja1() {
        return pelaaja;
    }

    public Pacman getPacman() {
        return pacman;
    }

    public ArrayList<Hahmo> getSeinat() {
        return seinat;
    }

    public void setPelaaja(Pelaaja pelaaja) {
        this.pelaaja = pelaaja;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public boolean isPaused() {
        return paused;
    }

    public void setPaused(boolean paused) {
        this.paused = paused;
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (!paused) {
            super.paintComponent(g);
            g.setColor(new Color(75,0,130));
//            g.fillRect(0, 0, 1310, 730);

            for (Hahmo hahmo : pistepallot) {
                hahmo.luo(g);
            }
            for (Hahmo e : elamat) {
                e.luo(g);
            }
            this.pacman.luo(g);
            for (Hahmo v : viholliset) {
                v.luo(g);
            }
            for (Hahmo seina : seinat) {
                seina.luo(g);
            }
            for (Hahmo m : miinat) {
                m.luo(g);
            }
            for (Hahmo luoti : aallot) {
                luoti.luo(g);
                luoti.liiku();
            }
            if (pelaaja != null) {
                pelaaja.luoNakyma(g);
            }

            g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
            g.setColor(new Color(230, 150, 0, 80));
            g.fill3DRect(540, 615, 200, 100, true);
            g.setColor(Color.black);
            g.drawString("Level: " + this.level, 580, 660);

            if (gameOver) {
                displayGameOver(g);
            }
        }

    }

    public void displayPause(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Pause", 340, 350);
    }

    private void displayGameOver(Graphics g) {
        g.setFont(new Font("TimesRoman", Font.BOLD, 100));
        g.setColor(Color.PINK);
        g.drawString("GAME OVER", 300, 330);
    }

    public void PacmanAmpuu() {
        this.aallot.add(new Aalto(pacman.getX(), pacman.getY(), pacman.getSuunta()));
    }
}

package Grafiikat;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import pacman.main.Pelaaja;

/**
 *
 * @author eamiller
 */
public class Piirtoalusta extends JPanel {

    private Pacman pacman;
    private Pelaaja pelaaja;
    private ArrayList<Hahmo> hahmot;

    public Piirtoalusta() {
        hahmot = new ArrayList<Hahmo>();
        pelaaja = null;
    }

    public void lisaaPacman(Pacman p) {
        this.pacman = p;

    }

    public void lisaaHahmo(Hahmo h) {
        hahmot.add(h);
    }

    public void pacmanEhkaSyo() {
        boolean loydettiin = false;
        int apu = 0;
        int index = 0;
        for (Hahmo h : hahmot) {
            if (hahmotKoskettavat(pacman, h)) {
                index = apu;
                loydettiin = true;
                h.setMaalataan(false);
                pelaaja.lisaaPisteita(5);
            } else {
                apu++;
            }
        }
        if (loydettiin) {
            hahmot.remove(index);
        }

    }

    private boolean hahmotKoskettavat(Hahmo h1, Hahmo h2) {

        if (h2.getX() - 25 < h1.getX() && h1.getX() < h2.getX() + 30) {
            if (h2.getY() - 35 < h1.getY() && h1.getY() < h2.getY() + 25) {
                return true;
            }
        }

        return false;
    }

    public void setPelaaja(Pelaaja pelaaja) {
        this.pelaaja = pelaaja;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Hahmo hahmo : hahmot) {
            hahmo.luo(g);
        }
        this.pacman.luo(g);
        if (pelaaja != null) {
            pelaaja.luoNakyma(g);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman.main;

import Grafiikat.Hahmo;
import Grafiikat.Pacman;
import Grafiikat.Piirtoalusta;
import Grafiikat.PistePallo;
import Grafiikat.Suunta;
import Pacman.UI.Kayttoliittyma;
import Pacman.UI.Nappaimistonkuuntelija;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author eamiller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        Pelaaja Evan = new Pelaaja("Evan");
        Pacman pacman = new Pacman(50, 50);

        pacman.setSuunta(Suunta.OIKEA);

        Piirtoalusta piirtoalusta = new Piirtoalusta();
        piirtoalusta.setPelaaja(Evan);
        piirtoalusta.lisaaPacman(pacman);

        luoPistepallotSatunnaisesti(piirtoalusta, 010);
//        piirtoalusta.poistaHahmo(piste1.getX(), piste1.getY());

        Kayttoliittyma k = new Kayttoliittyma(piirtoalusta, new Nappaimistonkuuntelija(pacman));
        k.run();

        while (true) {
            Thread.sleep(25);
            pacman.liiku();
            piirtoalusta.pacmanEhkaSyo();
            piirtoalusta.repaint();
        }
    }

    private static void luoPistepallotSatunnaisesti(Piirtoalusta p, int kpl) {
        int randomX;
        int randomY;
        for (int i = 0; i < kpl; i++) {
            randomY = 0 + (int) (Math.random() * 700);
            randomX = 0 + (int) (Math.random() * 1200);
            p.lisaaHahmo(new PistePallo(randomX, randomY));
        }
    }

}

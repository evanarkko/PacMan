/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman.main;

import Pacman.viholliset.Aly2;
import Pacman.viholliset.Aly1;
import Pacman.viholliset.Aly3;
import pacman.pelioliot.Hahmo;
import pacman.pelioliot.Pacman;
import Grafiikat.Piirtoalusta;
import pacman.pelioliot.pisteet.PistePallo;
import pacman.pelioliot.Suunta;
import pacman.pelioliot.Vihollinen;
import Pacman.UI.Kayttoliittyma;
import Pacman.UI.Nappaimistonkuuntelija;
import Pacman.viholliset.BlackHole;
import Pacman.viholliset.VartijaX;
import Pacman.viholliset.VartijaY;
import java.util.ArrayList;
import java.util.Random;
import pacman.pelioliot.pisteet.IsoPistePallo;
import pacman.pelioliot.Miina;
import pacman.pelioliot.Seina;
import pacman.pelioliot.pisteet.IsoinPistePallo;

/**
 *
 * @author eamiller
 */
public class Main {
    
    private static void lisaaViholliset(Piirtoalusta p, int level) {
        switch (level) {
            case 1:
                p.lisaaVihollinen(new Aly1(0, 0, 1));
                break;
            case 2:
                p.lisaaVihollinen(new Aly2(0, 0, 2));
                p.lisaaVihollinen(new Aly3(1200, 600, 2));
                break;
            case 3:
                p.lisaaVihollinen(new Aly1(0, 300, 2));
                p.lisaaVihollinen(new VartijaX(100, 10));
                p.lisaaVihollinen(new VartijaX(1000, 650));
                break;
            case 4:
                p.lisaaVihollinen(new VartijaY(100, 300));
                p.lisaaVihollinen(new VartijaY(1100, 300));
                p.lisaaVihollinen(new VartijaX(1100, 50));
                p.lisaaVihollinen(new VartijaX(1100, 600));
                break;
            case 5:
                p.lisaaVihollinen(new Aly1(50, 250));
                p.lisaaVihollinen(new Aly1(50, 350));
                p.lisaaVihollinen(new Aly1(50, 450));
                p.lisaaVihollinen(new Aly2(600, 10));
                p.lisaaVihollinen(new Aly2(600, 350));
                p.lisaaVihollinen(new Aly2(600, 700));
                p.lisaaVihollinen(new Aly3(1200, 250));
                p.lisaaVihollinen(new Aly3(1200, 350));
                p.lisaaVihollinen(new Aly3(1200, 450));
                break;
            case 6:
                p.lisaaVihollinen(new VartijaX(10, 10));
                p.lisaaVihollinen(new VartijaX(10, 300));
                p.lisaaVihollinen(new VartijaX(10, 650));
                p.lisaaVihollinen(new VartijaY(10, 10));
                p.lisaaVihollinen(new VartijaY(550, 550));
                p.lisaaVihollinen(new VartijaY(1100, 10));
                break;
            case 7:
                p.lisaaVihollinen(new Aly1(50, 250, 2));
                p.lisaaVihollinen(new Aly1(50, 350, 2));
                p.lisaaVihollinen(new Aly1(50, 450, 2));
                p.lisaaVihollinen(new Aly2(600, 10, 3));
                p.lisaaVihollinen(new Aly2(600, 350, 3));
                p.lisaaVihollinen(new Aly2(600, 700, 3));
                p.lisaaVihollinen(new Aly3(1200, 250, 4));
                p.lisaaVihollinen(new Aly3(1200, 350, 4));
                p.lisaaVihollinen(new Aly3(1200, 450, 4));
                break;
            case 8:
                p.lisaaVihollinen(new VartijaX(10, 10));
                p.lisaaVihollinen(new VartijaX(10, 100));
                p.lisaaVihollinen(new VartijaX(10, 200));
                p.lisaaVihollinen(new VartijaX(10, 300));
                p.lisaaVihollinen(new VartijaX(10, 400));
                p.lisaaVihollinen(new VartijaX(10, 500));
                p.lisaaVihollinen(new VartijaX(10, 600));
                p.lisaaVihollinen(new VartijaX(10, 700));
                break;
            case 9:
                break;
            case 10:
                p.lisaaVihollinen(new Aly1(0, 10));
                p.lisaaVihollinen(new Aly1(200, 10));
                p.lisaaVihollinen(new Aly1(400, 10));
                p.lisaaVihollinen(new Aly1(600, 10));
                p.lisaaVihollinen(new Aly2(800, 10));
                p.lisaaVihollinen(new Aly2(1000, 10));
                p.lisaaVihollinen(new Aly2(1200, 10));
                p.lisaaVihollinen(new Aly3(10, 600));
                p.lisaaVihollinen(new Aly3(100, 600));
                p.lisaaVihollinen(new Aly3(200, 200));
                break;
            case 11:
                p.lisaaVihollinen(new Aly1(0, 350, 6));
                p.lisaaVihollinen(new Aly1(1250, 350, 6));
                break;
            case 12:
                p.lisaaVihollinen(new Aly1(0, 0));
                p.lisaaVihollinen(new Aly1(1200, 600));
                p.lisaaVihollinen(new Aly1(500, 300));
                p.lisaaVihollinen(new Aly1(0, 300));
                p.lisaaVihollinen(new Aly2(1100, 0));
                p.lisaaVihollinen(new Aly2(800, 500));
                p.lisaaVihollinen(new Aly2(500, 800));
                p.lisaaVihollinen(new Aly2(300, 800));
                p.lisaaVihollinen(new Aly3(200, 200));
                p.lisaaVihollinen(new Aly3(900, 200));
                break;
            case 13:
                p.lisaaVihollinen(new Aly2(1250, 0, 6));
                p.lisaaVihollinen(new Aly2(0, 0, 6));
                p.lisaaVihollinen(new Aly2(0, 800, 6));
                p.lisaaVihollinen(new Aly2(1250, 800, 6));
                break;
            case 14:

                p.lisaaVihollinen(new Aly1(100, 0));
                p.lisaaVihollinen(new Aly1(1200, 600));
                p.lisaaVihollinen(new Aly1(500, 300));
                p.lisaaVihollinen(new Aly1(0, 300));
                p.lisaaVihollinen(new Aly2(1100, 0));
                p.lisaaVihollinen(new Aly2(800, 500));
                p.lisaaVihollinen(new Aly2(500, 800));
                p.lisaaVihollinen(new Aly2(300, 800));
                p.lisaaVihollinen(new Aly2(350, 150));
                p.lisaaVihollinen(new Aly3(10, 600));
                p.lisaaVihollinen(new Aly3(100, 600));
                p.lisaaVihollinen(new Aly3(200, 200));
                p.lisaaVihollinen(new Aly3(900, 200));
                break;
            case 15:
                p.lisaaVihollinen(new BlackHole(100, 100, 4));
                break;
            case 20:
                for(int i = 0; i > -5000; i -= 300){
                    p.lisaaVihollinen(new Aly2(0, i, 5));
                }
                for(int i = 0; i < 5000; i += 400){
                    p.lisaaVihollinen(new Aly2(1250, i, 5));
                }
                for(int i = 4000; i < 5000; i += 400){
                    p.lisaaVihollinen(new Aly1(i, 0, 5));
                }
                
                break;
            case 16:
                for (int i = 0; i < 1300; i += 50) {
                    p.lisaaVihollinen(new Aly2(i, 0));
                }
                for (int i = 0; i < 1300; i += 50) {
                    p.lisaaVihollinen(new Aly2(i, 600));
                }
                
                for (int i = 0; i < 750; i += 50) {
                    p.lisaaVihollinen(new Aly1(0, i));
                }
                for (int i = 0; i < 750; i += 50) {
                    p.lisaaVihollinen(new Aly1(1100, i));
                }
                
                break;
            case 18:
                for(int i = 0; i > -5000; i -= 300){
                    p.lisaaVihollinen(new Aly2(0, i, 5));
                }
                for(int i = 0; i < 5000; i += 400){
                    p.lisaaVihollinen(new Aly2(1250, i, 5));
                }
                for(int i = 4000; i < 5000; i += 400){
                    p.lisaaVihollinen(new Aly1(i, 0, 5));
                }
                break;
            case 19:
                for(int i = 0; i > -5000; i -= 300){
                    p.lisaaVihollinen(new Aly2(0, i, 5));
                }
                for(int i = 0; i < 5000; i += 400){
                    p.lisaaVihollinen(new Aly2(1250, i, 5));
                }
                for(int i = 4000; i < 5000; i += 400){
                    p.lisaaVihollinen(new Aly1(i, 0, 5));
                }
                break;
            
//            case 18:
//                break;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        int level = 1;
        int kierroslaskuri = 0;

        Pelaaja evan = new Pelaaja("Evan");
        Pacman pacman = new Pacman(650, 350);
        pacman.setSuunta(Suunta.OIKEA);

        Piirtoalusta piirtoalusta = new Piirtoalusta();
        piirtoalusta.setPelaaja(evan);
        piirtoalusta.lisaaPacman(pacman);

        luoPistepallojaSatunnaisesti(piirtoalusta, 25);

        Kayttoliittyma k = new Kayttoliittyma(piirtoalusta, new Nappaimistonkuuntelija(pacman, piirtoalusta));
        k.run();

        while (evan.getElamia() > 0) {  //PELILOOPPI
            if (!piirtoalusta.isPaused()) {
                kierroslaskuri++;
                if (piirtoalusta.getViholliset().isEmpty()) {
                    piirtoalusta.setLevel(level);
                    lisaaViholliset(piirtoalusta, level);
                    level++;
                }
                Thread.sleep(25);
                pacman.liiku();
                for (Vihollinen v : piirtoalusta.getViholliset()) {
                    v.liiku(pacman.getX(), pacman.getY());
                }
                pacmanEhkaSyo(piirtoalusta);
                pacmanEhkaOttaaDamagea(piirtoalusta);
                if (piirtoalusta.getPacman().isKuollut()) {
                    piirtoalusta.getPelaaja1().menetaElama();
                    if (piirtoalusta.getPelaaja1().getElamia() > 0) {
                        pacman.revive();
                    } else {
                        piirtoalusta.setGameOver(true);
                    }
                }
//            pacmanEhkaOsuuSeinaan(piirtoalusta);
                miinaEhkaTekeeTuhojaan(piirtoalusta);
                vihollinenEhkaOttaaDamagea(piirtoalusta);
                aaltoEhkaPoistuuAlueelta(piirtoalusta);
                piirtoalusta.repaint();
            }
        }
    }

    private static boolean hahmotKoskettavat(Hahmo h1, Hahmo h2) {
        if (h2.getX() - 50 < h1.getX() && h1.getX() < h2.getX() + 25) {
            if (h2.getY() - 50 < h1.getY() && h1.getY() < h2.getY() + 35) {
                return true;
            }
        }

        return false;
    }

    private static void ehkaLisaElama(Piirtoalusta p) {
        if (hahmotKoskettavat(p.getElamapallo(), p.getPacman())) {
            p.getPelaaja1().lisaaElama();
            p.setElamapallo(null);
        }
    }

    private static void miinaEhkaTekeeTuhojaan(Piirtoalusta p) {
        int apu = -1;
        int vindex = 0;
        int mindex = 0;
        for (Vihollinen vihollinen : p.getViholliset()) {
            for (Miina miina : p.getMiinat()) {
                miina.laskuriEtenee();
                if (miina.getLaskuri() > 10) {
                    apu = mindex;
                }
                if (hahmotKoskettavat(vihollinen, miina)) {
                    vihollinen.otaDamagea(10);
                    miina.kaynnistaLaskuri();
                    if (vihollinen.isKuollut()) {
                        p.getViholliset().remove(vindex);
                        p.getPelaaja1().lisaaPisteita(10);
                        return;
                    }
                }
                mindex++;
            }
            vindex++;
            mindex = 0;
        }
        if (apu >= 0) {
            p.getMiinat().remove(apu);
        }
    }

    private static void pacmanEhkaOsuuSeinaan(Piirtoalusta piirtoalusta) {
        boolean osuuYlaseinaan = false;
        boolean osuuAlaseinaan = false;
        boolean osuuOikeaanseinaan = false;
        boolean osuuVasempaanseinaan = false;

        for (Hahmo seina : piirtoalusta.getSeinat()) {
            Pacman p = piirtoalusta.getPacman();

            if (hahmotKoskettavat(p, seina)) {
                if (seina.getX() - 50 < p.getX() && p.getX() < seina.getX() + 30) {
                    if (seina.getX() > p.getX()) {
                        osuuOikeaanseinaan = true;
                        p.setLiikkuminenOikealleSallittu(false);
                    } else if (seina.getX() < p.getX()) {
                        osuuVasempaanseinaan = true;
                        p.setLiikkuminenVasemmalleSallittu(false);
                    }
                }
                if (seina.getY() - 50 < p.getY() && p.getY() < seina.getY() + 30) {
                    if (seina.getY() > p.getY()) {
                        osuuAlaseinaan = true;
                        p.setLiikkuminenAlasSallittu(false);
                    } else if (seina.getY() > p.getY()) {
                        osuuYlaseinaan = true;
                        p.setLiikkuminenYlosSallittu(false);
                    }
                }
            }

            if (!osuuOikeaanseinaan) {
                p.setLiikkuminenOikealleSallittu(true);
            }
            if (!osuuVasempaanseinaan) {
                p.setLiikkuminenVasemmalleSallittu(true);
            }
            if (!osuuYlaseinaan) {
                p.setLiikkuminenYlosSallittu(true);
            }
            if (!osuuAlaseinaan) {
                p.setLiikkuminenAlasSallittu(true);
            }
        }
    }

    private static void pacmanEhkaOttaaDamagea(Piirtoalusta piirtoalusta) {
        for (Hahmo vihollinen : piirtoalusta.getViholliset()) {
            if (hahmotKoskettavat(piirtoalusta.getPacman(), vihollinen)) {
                vihollinen.setMaalataan(false);
                piirtoalusta.getPacman().otaDamagea(1);
            }
        }
    }

    private static void vihollinenEhkaOttaaDamagea(Piirtoalusta piirtoalusta) {
        int apu = 0;
        int index = 0;
        for (Vihollinen vihollinen : piirtoalusta.getViholliset()) {
            for (Hahmo aalto : piirtoalusta.getAallot()) {
                if (hahmotKoskettavat(vihollinen, aalto)) {
                    vihollinen.otaDamagea(1);
                    if (vihollinen.isKuollut()) {
                        piirtoalusta.getViholliset().remove(index);
                        piirtoalusta.getPelaaja1().lisaaPisteita(10);
                        return;
                    }
                }
            }
            index++;
        }
    }

    private static void aaltoEhkaPoistuuAlueelta(Piirtoalusta p) {
        boolean loytyi = false;
        int i = 0;
        for (Hahmo h : p.getAallot()) {
            if (h.getX() < 0 || h.getX() > 1300 || h.getY() < -10 || h.getY() > 730) {
                loytyi = true;
                break;
            }
            i++;
        }
        if (loytyi) {
            p.getAallot().remove(i);
        }

    }

    private static void pacmanEhkaSyo(Piirtoalusta piirtoalusta) {
        boolean loydettiin = false;
        int apu = 0;
        int index = 0;
        int kpl = 0;
        for (PistePallo pistepallo : piirtoalusta.getPistepallot()) {
            if (hahmotKoskettavat(piirtoalusta.getPacman(), pistepallo)) {
                index = apu;
                loydettiin = true;
                piirtoalusta.getPelaaja1().lisaaPisteita(pistepallo.getArvo());
                if (pistepallo.getArvo() == 5) {
                    kpl = 1;
                } else if (pistepallo.getArvo() == 10) {
                    kpl = 2;
                }
            } else {
                apu++;
            }
        }
        if (loydettiin) {
            piirtoalusta.getPistepallot().remove(index);
            luoPistepallojaSatunnaisesti(piirtoalusta, kpl);
        }

    }

    private static void luoPistepallojaSatunnaisesti(Piirtoalusta p, int kpl) {
        int randomX;
        int randomY;

        if (kpl == 1) {
            randomY = 0 + (int) (Math.random() * 700);
            randomX = 0 + (int) (Math.random() * 1200);
            p.lisaaPistepallo(new PistePallo(randomX, randomY));
        } else if (kpl == 2) {
            randomY = 0 + (int) (Math.random() * 700);
            randomX = 0 + (int) (Math.random() * 1200);
            p.lisaaPistepallo(new IsoPistePallo(randomX, randomY));
        } else {
            for (int i = 0; i < kpl / 5; i++) {
                randomY = 0 + (int) (Math.random() * 700);
                randomX = 0 + (int) (Math.random() * 1200);
                p.lisaaPistepallo(new IsoinPistePallo(randomX, randomY));
            }
            for (int i = 0; i < kpl / 3; i++) {
                randomY = 0 + (int) (Math.random() * 700);
                randomX = 0 + (int) (Math.random() * 1200);
                p.lisaaPistepallo(new IsoPistePallo(randomX, randomY));
            }
            for (int i = 0; i < kpl; i++) {
                randomY = 0 + (int) (Math.random() * 700);
                randomX = 0 + (int) (Math.random() * 1200);
                p.lisaaPistepallo(new PistePallo(randomX, randomY));
            }
        }

    }

    public static void luoMatriisi() {
        char x[][] = {
            {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
            {'x', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', 'X', '.', '.', '.', 'X'},
            {'X', '.', '.', 'X', '.', '.', '.', '.', 'X', '.', 'X', '.', '.', 'X', '.', '.', '.', 'X'},
            {'X', '.', 'X', 'X', '.', '.', 'X', 'X', 'X', '.', 'X', '.', '.', 'X', '.', '.', '.', 'X'},
            {'X', '.', '.', '.', '.', '.', '.', '.', 'X', '.', 'X', '.', '.', 'X', '.', '.', '.', 'X'},
            {'X', 'X', 'X', 'X', 'X', 'X', 'X', '.', 'X', '.', 'X', '.', '.', 'X', 'X', 'X', '.', 'X'},
            {'.', '.', '.', 'X', '.', '.', 'X', '.', '.', '.', 'X', '.', '.', '.', '.', '.', '.', '.'},
            {'X', '.', '.', 'X', '.', '.', 'X', '.', '.', '.', 'X', '.', '.', '.', '.', '.', '.', 'X'},
            {'X', '.', '.', 'X', '.', '.', 'X', '.', '.', '.', 'X', '.', '.', 'X', 'X', 'X', 'X', 'X'},
            {'X', '.', '.', 'X', '.', '.', '.', '.', '.', '.', 'X', '.', '.', '.', '.', '.', 'X', 'X'},
            {'X', 'X', '.', 'X', '.', '.', '.', 'X', '.', '.', '.', '.', '.', 'X', 'X', '.', '.', 'X'},
            {'X', '.', '.', 'X', 'X', 'X', '.', '.', 'X', 'X', 'X', 'X', 'X', '.', 'X', '.', '.', 'X'},
            {'X', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', 'X'},
            {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'}};
        //14x18
        System.out.println(x[0].length);

    }

    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman.main;

import Grafiikat.Pacman;
import Grafiikat.Piirtoalusta;
import Grafiikat.Suunta;
import Pacman.UI.Kayttoliittyma;
import Pacman.UI.Nappaimistonkuuntelija;

/**
 *
 * @author eamiller
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Pacman pacman = new Pacman(50, 50);
        pacman.setSuunta(Suunta.OIKEA);
        
        Piirtoalusta piirtoalusta = new Piirtoalusta();
        piirtoalusta.lisaaHahmo(pacman);
        
        Kayttoliittyma k = new Kayttoliittyma(piirtoalusta, new Nappaimistonkuuntelija(pacman));
        k.run();
        
        while(true){
            Thread.sleep(25);
            pacman.liiku();
            piirtoalusta.repaint();
        }
    }
    
}

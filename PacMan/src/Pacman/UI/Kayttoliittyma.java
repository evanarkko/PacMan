
package Pacman.UI;

import Grafiikat.Piirtoalusta;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author eamiller
 */
public class Kayttoliittyma implements Runnable{
    private JFrame frame;
    private JPanel piirtoalusta;
    private KeyListener kuuntelija;

    public Kayttoliittyma(JPanel piirtoalusta, KeyListener k) {
        this.kuuntelija = k;
        this.piirtoalusta = piirtoalusta;
    }

    
    
    @Override
    public void run() {
        frame = new JFrame("Otsikko");
        frame.setPreferredSize(new Dimension(1310, 730));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true); 
    }

    private void luoKomponentit(Container container) {
        container.add(piirtoalusta);
        frame.addKeyListener(kuuntelija);
    }

    public JFrame getFrame() {
        return frame;
    }
    
}

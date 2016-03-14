package Grafiikat;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author eamiller
 */
public class Piirtoalusta extends JPanel {

    private ArrayList<Hahmo> hahmot;

    public Piirtoalusta() {
        hahmot = new ArrayList<Hahmo>();
    }
    
    public void lisaaHahmo(Hahmo h){
        hahmot.add(h);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        for (Hahmo hahmo : hahmot) {
            hahmo.luo(graphics);
        }
    }
}

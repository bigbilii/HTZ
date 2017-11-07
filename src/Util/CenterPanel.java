package Util;

import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {
    private double rate;
    private boolean strech;
    private JComponent c;

    public CenterPanel(double rate, boolean strech) {
        this.rate = rate;
        this.strech = strech;
    }

    public CenterPanel(double rate) {
        this(rate,true);
    }

    public void repaint() {
        if(null != c) {
            Dimension containerSize = this.getSize();
            Dimension componentSize = c.getPreferredSize();

            if (strech)
                c.setSize((int) containerSize.width, (int) containerSize.height);
            else
                c.setSize(componentSize);

            c.setLocation((containerSize.width - c.getSize().width ) / 2, (containerSize.height - c.getSize().height) / 2);

            super.repaint();
        }
    }

    public void show(JComponent p) {
        this.c = p;
        Component[] cs = getComponents();
        for (Component c : cs) {
            remove(c);
        }

        add(p);
        this.updateUI();

    }
}

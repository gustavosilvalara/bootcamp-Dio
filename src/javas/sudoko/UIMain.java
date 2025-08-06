package javas.sudoko;

import javax.swing.*;
import java.awt.*;
import javas.sudoko.ui.costum.panel.MainPanel;
import javas.sudoko.ui.frame.MainFrame;

public class UIMain {
    public static void main(String[] args) {
        Dimension dimension = new Dimension(600, 600);
        JPanel mainPanel = new MainPanel(dimension);
        JFrame mainFrame = new MainFrame(dimension, mainPanel);
        mainFrame.revalidate();
        mainFrame.repaint();
    }
}

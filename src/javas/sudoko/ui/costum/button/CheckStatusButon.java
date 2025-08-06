package javas.sudoko.ui.costum.button;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CheckStatusButon extends JButton {

    public CheckStatusButon(final ActionListener actionListener){
        this.setText("Verificar jogo");
        this.addActionListener(actionListener);
    }
}

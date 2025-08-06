package javas.sudoko.ui.costum.button;

import javax.swing.*;
import java.awt.event.ActionListener;

public class FinishGameButton extends JButton {

    public FinishGameButton(final ActionListener actionListener){
        this.setText("Concluir Sudoku");
        this.addActionListener(actionListener);
    }


}

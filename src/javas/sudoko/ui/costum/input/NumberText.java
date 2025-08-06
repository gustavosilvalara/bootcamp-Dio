package javas.sudoko.ui.costum.input;

import javas.sudoko.model.Space;
import javas.sudoko.service.EventEnum;
import javas.sudoko.service.EventListener;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.Dimension;
import java.awt.Font;

import static java.awt.Font.PLAIN;
import static javas.sudoko.service.EventEnum.CLEAR_SPACE;

public class NumberText extends JTextField implements EventListener {

    private final Space space;

    public NumberText(final Space space){
        this.space = space;
        Dimension dimension = new Dimension(50,50);
        this.setSize(dimension);
        this.setPreferredSize(dimension);
        this.setVisible(true);
        this.setFont(new Font("Arial", PLAIN, 20));
        this.setHorizontalAlignment(CENTER);
        this.setDocument(new NumberTextLimit());
        this.setEnabled(!space.isFixed());
        if (space.isFixed()){
            setText(space.getActual().toString());
        }
        this.getDocument().addDocumentListener(new DocumentListener() {

            private void changeSpace(){
                if (getText().isBlank()){
                    space.clear();
                    return;
                }else {
                    space.setActual(Integer.parseInt(getText()));
                }
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                changeSpace();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                changeSpace();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                changeSpace();
            }
        });

    }

    @Override
    public void update(EventEnum eventType) {
        if (eventType.equals(CLEAR_SPACE) && this.isEnabled()){
            this.setText("");
        }
    }
}

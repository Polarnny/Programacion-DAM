import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterruptorMagico {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Boton Magico");
        ventana.setSize(800,600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new FlowLayout());

        JPanel panel = new JPanel();

        JButton boton = new JButton("Boton Magico");
        JCheckBox box = new JCheckBox("Activar/Desactivar");
        boton.setEnabled(false);

        box.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e){
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    boton.setEnabled(true);
                }
                else{
                    boton.setEnabled(false);
                }
            }    
        });

        panel.add(boton);
        panel.add(box);
        ventana.add(panel);
        ventana.setVisible(true);

    }
}
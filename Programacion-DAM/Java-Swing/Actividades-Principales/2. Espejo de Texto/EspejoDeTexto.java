import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class EspejoDeTexto {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Mirall de text");
        ventana.setSize(1000,750);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new GridLayout(4,4));

        JTextField texto = new JTextField();
        JLabel otro = new JLabel();

        texto.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                otro.setText(texto.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                otro.setText(texto.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                otro.setText(texto.getText());
            }
        });
        
        ventana.add(texto);
        ventana.add(otro);
        ventana.setVisible(true);
    }
}
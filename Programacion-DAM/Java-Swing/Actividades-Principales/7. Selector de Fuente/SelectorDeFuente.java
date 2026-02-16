import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JSlider;

public class SelectorDeFuente {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Selector de font");
        ventana.setSize(1000,750);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new GridLayout(4,4));

        JSlider slider = new JSlider(10,50);
        JLabel label = new JLabel("Hola :)");

        slider.addChangeListener(e -> {
            int tamaño = slider.getValue();
            label.setFont(label.getFont().deriveFont((float) tamaño));
        });

        ventana.add(slider);
        ventana.add(label);
        ventana.setVisible(true);
    }
}
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SaludoPersonalizado extends JFrame {
    public Main() {
        setTitle("Saluda'm");
        setSize(350, 180);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        JComboBox<String> combo = new JComboBox<>(new String[]{"Sr.", "Sra.", "Dr."});
        JTextField nom = new JTextField(15);
        JButton saluda = new JButton("Saluda");

        saluda.addActionListener(e -> {
            String t = (String) combo.getSelectedItem();
            JOptionPane.showMessageDialog(this, "Hola, " + t + " " + nom.getText() + "!");
        });

        add(new JLabel("Títol:"));
        add(combo);
        add(new JLabel("Nom:"));
        add(nom);
        add(saluda);

        setVisible(true);
    }
}
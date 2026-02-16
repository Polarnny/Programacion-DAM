import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;

public class ListaDeLaCompra {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Lista Compra");
        ventana.setSize(1000,750);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new GridLayout(4,4));

        JTextField field = new JTextField();
        JButton boton = new JButton("Añadir a la lista");

        DefaultListModel<String> modelo = new DefaultListModel<>();
        JList<String> lista = new JList<>(modelo);

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String añadido = field.getText();
                if (!añadido.isEmpty()) {
                    modelo.addElement(añadido);
                    field.setText("");
                }
            };
        });


        ventana.add(field);
        ventana.add(boton);
        ventana.add(lista);
        ventana.setVisible(true);
    }
}
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SumadoraExpress {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Boton Magico");
        ventana.setSize(800,600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new GridLayout(4,4));

        JTextField text1 = new JTextField();
        JTextField text2 = new JTextField();
        JButton boton = new JButton("Sumar");
        JTextArea resultado = new JTextArea();

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(text1.getText());
                    int num2 = Integer.parseInt(text2.getText());
                    int suma = num1 + num2;
                    resultado.setText("Resultado: " + suma);
                } catch (NumberFormatException ex) {
                    System.out.println("Error");
                }
            };
        });

        ventana.add(text1);
        ventana.add(text2);
        ventana.add(boton);
        ventana.add(resultado);
        ventana.setVisible(true);
    }
}
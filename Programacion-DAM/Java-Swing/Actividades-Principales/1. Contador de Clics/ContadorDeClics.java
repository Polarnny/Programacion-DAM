import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ContadorDeClics {
    private static int contador = 0;
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Contador de clics");
        ventana.setSize(800,600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new FlowLayout());

        JButton boton = new JButton("Boton");
        JLabel texto = new JLabel("click " + contador);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                contador++;
                texto.setText("click " + contador);
            }
        });

        ventana.add(boton);
        ventana.add(texto);
        ventana.setVisible(true);
    }
}
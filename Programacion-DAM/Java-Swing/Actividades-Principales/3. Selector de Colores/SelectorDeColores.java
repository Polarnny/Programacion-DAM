import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SelectorDeColores {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Mirall de text");
        ventana.setSize(800,600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new FlowLayout());

        JButton boton1 = new JButton();
        boton1.setBackground(new Color(255,0,0));

        JButton boton2 = new JButton();
        boton2.setBackground(new Color(0,255,0));

        JButton boton3 = new JButton();
        boton3.setBackground(new Color(0,0,255));

        JPanel salida = new JPanel();

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                salida.setBackground(Color.red);
            }
        });
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                salida.setBackground(Color.green);
            }
        });
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                salida.setBackground(Color.blue);
            }
        });

        ventana.add(boton1);
        ventana.add(boton2);
        ventana.add(boton3);
        ventana.add(salida);
        ventana.setVisible(true);
    }
}
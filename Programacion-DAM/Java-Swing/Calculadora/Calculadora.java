import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora {

    // Iniciamos variables que utilizaremos para los action listener
    static double numeroGuardado = 0;
    static String signo = "";

    public static void main(String[] args) {

        // Esta es la ventana principal
        JFrame ventana = new JFrame("Calculadora");
        ventana.setSize(400, 500);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new GridLayout(3, 1)); // Usare el grid para que vaya por filas y columnas

        // Este es el panel del historial donde se ira viendo las operaciones
        JPanel panelHistorial = new JPanel();
        panelHistorial.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panelHistorial.setBackground(new Color(250, 250, 250));
        panelHistorial.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Las caracteristicas del panel del historial
        JTextField historial = new JTextField(" ");
        historial.setEditable(false); //Ponemos que en el historial no se pueda escribir
        historial.setHorizontalAlignment(JTextField.RIGHT); // Ponemos que salga el texto a la derecha
        historial.setFont(new Font("Arial", Font.PLAIN, 20));
        historial.setBackground(new Color(225, 225, 225));
        historial.setPreferredSize(new java.awt.Dimension(360, 50)); // Le ponemos un tamaño al panel del historial
        historial.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelHistorial.add(historial);
        ventana.add(panelHistorial);

        // Este es el panel donde se vera el resultado de la operacion
        JPanel panelResultado = new JPanel();
        panelResultado.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panelResultado.setBackground(new Color(250, 250, 250));
        panelResultado.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));

        // Las caracteristicas del panel de la pantalla
        JTextField pantalla = new JTextField("0");
        pantalla.setEditable(false);
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        pantalla.setFont(new Font("Arial", Font.BOLD, 48));
        pantalla.setBackground(Color.WHITE); // Ponemos el fondo de la pantalla en blanco
        pantalla.setPreferredSize(new java.awt.Dimension(360, 100));
        pantalla.setBorder(BorderFactory.createLineBorder(new Color(180, 180, 180), 1));
        panelResultado.add(pantalla);
        ventana.add(panelResultado);

        // Este es el panel general de los botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(4, 4, 8, 8));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(10, 12, 12, 12));

        // Boton C que servira para borrar lo que se ve
        JButton botonC = new JButton("C");
        botonC.setFont(new Font("Arial", Font.BOLD, 20));
        botonC.setBackground(new Color(255, 100, 100));
        botonC.setForeground(Color.WHITE); // Ponemos la letra en blanco
        // Abrimos el action listener para la accion del boton
        botonC.addActionListener(e -> {
            numeroGuardado = 0;
            signo = "";
            pantalla.setText("0"); // Enseñara el num 0
            historial.setText(""); // No enseñara nada en el historial
        });
        panelBotones.add(botonC);

        // Boton de la division
        JButton botonDiv = new JButton("/");
        botonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        botonDiv.setBackground(new Color(255, 200, 100));
        // Abrimos el action listener para la accion del boton
        botonDiv.addActionListener(e -> {
            numeroGuardado = Double.parseDouble(pantalla.getText());
            signo = "/"; // Enseñara el simbolo de la division
            historial.setText(numeroGuardado + " /"); // En el historial se vera lo que estamos haciendo
            pantalla.setText("0"); // Y el panel de la operacion se pondra en 0
        });
        panelBotones.add(botonDiv);

        // Para los siguientes botones sera practicamente lo mismo pero cambiando el simbolo o numero

        // Boton de la multiplicacion
        JButton botonMul = new JButton("*");
        botonMul.setFont(new Font("Arial", Font.BOLD, 20));
        botonMul.setBackground(new Color(255, 200, 100));
        // Abrimos el action listener para la accion del boton
        botonMul.addActionListener(e -> {
            numeroGuardado = Double.parseDouble(pantalla.getText());
            signo = "*";
            historial.setText(numeroGuardado + " *");
            pantalla.setText("0");
        });
        panelBotones.add(botonMul);

        // Boton de la resta
        JButton botonResta = new JButton("-");
        botonResta.setFont(new Font("Arial", Font.BOLD, 20));
        botonResta.setBackground(new Color(255, 200, 100));
        // Abrimos el action listener para la accion del boton
        botonResta.addActionListener(e -> {
            numeroGuardado = Double.parseDouble(pantalla.getText());
            signo = "-";
            historial.setText(numeroGuardado + " -");
            pantalla.setText("0");
        });
        panelBotones.add(botonResta);

        // Boton del numero 7
        JButton boton7 = new JButton("7");
        boton7.setFont(new Font("Arial", Font.BOLD, 20));
        // Abrimos el action listener para la accion del boton
        boton7.addActionListener(e -> {
            if (pantalla.getText().equals("0")) {
                pantalla.setText("7");
            } else {
                pantalla.setText(pantalla.getText() + "7");
            }
        });
        panelBotones.add(boton7);

        // Boton del numero 8
        JButton boton8 = new JButton("8");
        boton8.setFont(new Font("Arial", Font.BOLD, 20));
        // Abrimos el action listener para la accion del boton
        boton8.addActionListener(e -> {
            if (pantalla.getText().equals("0")) {
                pantalla.setText("8");
            } else {
                pantalla.setText(pantalla.getText() + "8");
            }
        });
        panelBotones.add(boton8);

        // Boton del numero 9
        JButton boton9 = new JButton("9");
        boton9.setFont(new Font("Arial", Font.BOLD, 20));
        // Abrimos el action listener para la accion del boton
        boton9.addActionListener(e -> {
            if (pantalla.getText().equals("0")) {
                pantalla.setText("9");
            } else {
                pantalla.setText(pantalla.getText() + "9");
            }
        });
        panelBotones.add(boton9);

        // Boton de la suma
        JButton botonSuma = new JButton("+");
        botonSuma.setFont(new Font("Arial", Font.BOLD, 20));
        botonSuma.setBackground(new Color(255, 200, 100));
        // Abrimos el action listener para la accion del boton
        botonSuma.addActionListener(e -> {
            numeroGuardado = Double.parseDouble(pantalla.getText());
            signo = "+";
            historial.setText(numeroGuardado + " +");
            pantalla.setText("0");
        });
        panelBotones.add(botonSuma);

        // Boton del numero 4
        JButton boton4 = new JButton("4");
        boton4.setFont(new Font("Arial", Font.BOLD, 20));
        // Abrimos el action listener para la accion del boton
        boton4.addActionListener(e -> {
            if (pantalla.getText().equals("0")) {
                pantalla.setText("4");
            } else {
                pantalla.setText(pantalla.getText() + "4");
            }
        });
        panelBotones.add(boton4);

        // Boton del numero 5
        JButton boton5 = new JButton("5");
        boton5.setFont(new Font("Arial", Font.BOLD, 20));
        // Abrimos el action listener para la accion del boton
        boton5.addActionListener(e -> {
            if (pantalla.getText().equals("0")) {
                pantalla.setText("5");
            } else {
                pantalla.setText(pantalla.getText() + "5");
            }
        });
        panelBotones.add(boton5);

        // Boton del numero 6
        JButton boton6 = new JButton("6");
        boton6.setFont(new Font("Arial", Font.BOLD, 20));
        // Abrimos el action listener para la accion del boton
        boton6.addActionListener(e -> {
            if (pantalla.getText().equals("0")) {
                pantalla.setText("6");
            } else {
                pantalla.setText(pantalla.getText() + "6");
            }
        });
        panelBotones.add(boton6);

        // Boton del igual que nos mostrara el resultado de la operacion
        JButton botonIgual = new JButton("=");
        botonIgual.setFont(new Font("Arial", Font.BOLD, 20));
        botonIgual.setBackground(new Color(100, 220, 100));
        botonIgual.setForeground(Color.WHITE);
        // Abrimos el action listener para la accion del boton
        botonIgual.addActionListener(e -> {
            if (signo.equals("")) {
                return;
            }

            double numero2 = Double.parseDouble(pantalla.getText());
            double resultado = 0;

            // Si se ha dado a la suma se sumara el numero guardado con el otro numero
            if (signo.equals("+")) {
                resultado = numeroGuardado + numero2;
            }
            // Si se ha dado a la resta se restara el numero guardado con el otro numero
            if (signo.equals("-")) {
                resultado = numeroGuardado - numero2;
            }
            // Si se ha dado a la multiplicacion se multiplicara el numero guardado con el otro numero
            if (signo.equals("*")) {
                resultado = numeroGuardado * numero2;
            }
            // Si se ha dado a la division se dividira el numero guardado con el otro numero
            if (signo.equals("/")) {
                // Si el segundo numero se ha pulsado el 0 enseñara un error porque no se puede dividir entre 0
                if (numero2 == 0) {
                    JOptionPane.showMessageDialog(ventana, "No se puede dividir por cero");
                    pantalla.setText("0");
                    historial.setText("");
                    signo = "";
                    return;
                }
                resultado = numeroGuardado / numero2;
            }

            pantalla.setText("" + resultado);
            historial.setText("");
            signo = "";
        });
        panelBotones.add(botonIgual);

        // Boton del numero 1
        JButton boton1 = new JButton("1");
        boton1.setFont(new Font("Arial", Font.BOLD, 20));
        // Abrimos el action listener para la accion del boton
        boton1.addActionListener(e -> {
            if (pantalla.getText().equals("0")) {
                pantalla.setText("1");
            } else {
                pantalla.setText(pantalla.getText() + "1");
            }
        });
        panelBotones.add(boton1);

        // Boton del numero 2
        JButton boton2 = new JButton("2");
        boton2.setFont(new Font("Arial", Font.BOLD, 20));
        // Abrimos el action listener para la accion del boton
        boton2.addActionListener(e -> {
            if (pantalla.getText().equals("0")) {
                pantalla.setText("2");
            } else {
                pantalla.setText(pantalla.getText() + "2");
            }
        });
        panelBotones.add(boton2);

        // Boton del numero 3
        JButton boton3 = new JButton("3");
        boton3.setFont(new Font("Arial", Font.BOLD, 20));
        // Abrimos el action listener para la accion del boton
        boton3.addActionListener(e -> {
            if (pantalla.getText().equals("0")) {
                pantalla.setText("3");
            } else {
                pantalla.setText(pantalla.getText() + "3");
            }
        });
        panelBotones.add(boton3);

        // Boton del numero 0
        JButton boton0 = new JButton("0");
        boton0.setFont(new Font("Arial", Font.BOLD, 20));
        // Abrimos el action listener para la accion del boton
        boton0.addActionListener(e -> {
            if (!pantalla.getText().equals("0")) {
                pantalla.setText(pantalla.getText() + "0");
            }
        });
        panelBotones.add(boton0);

        // Añadimos el panel de botones a la ventana principal y la mostramos
        ventana.add(panelBotones);
        ventana.setVisible(true);
    }
}

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class DetectorDeRaton {
    public static void main(String[] args) {
        JFrame finestra = new JFrame("Detector de Ratolí");
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra.setSize(500, 400);
        finestra.setLocationRelativeTo(null);

        JPanel panell = new JPanel();
        panell.setBackground(Color.WHITE);

        JLabel coords = new JLabel("Mou el ratolí...", SwingConstants.CENTER);
        coords.setFont(new Font("Monospaced", Font.PLAIN, 18));

        panell.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                coords.setText("X: " + e.getX() + "   Y: " + e.getY());
            }
        });

        finestra.setLayout(new BorderLayout());
        finestra.add(panell, BorderLayout.CENTER);
        finestra.add(coords, BorderLayout.SOUTH);

        finestra.setVisible(true);
    }
}
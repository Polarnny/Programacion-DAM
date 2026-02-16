import javax.swing.*;
import java.awt.*;

public class EscogerSO extends JFrame {

    private JLabel etiquetaImatge;

    public SistemaOperatiuSimple() {
        setTitle("Tria Sistema Operatiu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 350);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        ImageIcon iconWindows = new ImageIcon(getClass().getResource("/icons/windows.png"));
        ImageIcon iconLinux   = new ImageIcon(getClass().getResource("/icons/linux.png"));
        ImageIcon iconMac     = new ImageIcon(getClass().getResource("/icons/macos.png"));

        int mida = 160;
        iconWindows = new ImageIcon(iconWindows.getImage().getScaledInstance(mida, mida, Image.SCALE_SMOOTH));
        iconLinux   = new ImageIcon(iconLinux.getImage().getScaledInstance(mida, mida, Image.SCALE_SMOOTH));
        iconMac     = new ImageIcon(iconMac.getImage().getScaledInstance(mida, mida, Image.SCALE_SMOOTH));

        etiquetaImatge = new JLabel(iconWindows);
        etiquetaImatge.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panellRadios = new JPanel();
        panellRadios.setLayout(new BoxLayout(panellRadios, BoxLayout.Y_AXIS));

        ButtonGroup grup = new ButtonGroup();

        JRadioButton rbWindows = new JRadioButton("Windows", true);
        JRadioButton rbLinux   = new JRadioButton("Linux");
        JRadioButton rbMac     = new JRadioButton("macOS");

        grup.add(rbWindows);
        grup.add(rbLinux);
        grup.add(rbMac);

        panellRadios.add(rbWindows);
        panellRadios.add(rbLinux);
        panellRadios.add(rbMac);

        add(new JLabel("Tria el teu SO preferit", SwingConstants.CENTER), BorderLayout.NORTH);
        add(etiquetaImatge, BorderLayout.CENTER);
        add(panellRadios, BorderLayout.WEST);

        rbWindows.addActionListener(e -> etiquetaImatge.setIcon(iconWindows));
        rbLinux.addActionListener(e   -> etiquetaImatge.setIcon(iconLinux));
        rbMac.addActionListener(e     -> etiquetaImatge.setIcon(iconMac));

        setVisible(true);
    }
}
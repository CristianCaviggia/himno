package Ahorcado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyListener;

public class EscuchaTexto implements /*KeyAdapter, */ ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JTextField texto;

    public EscuchaTexto() {
        frame = new JFrame("Escucha Texto");
        panel = (JPanel) frame.getContentPane();
        texto = new JTextField("¿Sabes la respuesta?");
        texto.addActionListener(this);
    }

    public void visualizarComponentes() {
        frame.setVisible(true);
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void anadeComponentes() {
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.add(texto);
        decoraPanel();
    }

    private void decoraPanel() {
        panel.setBorder(new PanelBorder(Color.BLACK, 5, ""));
    }

    public void actionPerformed(ActionEvent e) {
        texto.setText("");
    }

    public static void main(String[] args) {
        EscuchaTexto nuevo = new EscuchaTexto();
        nuevo.anadeComponentes();
        nuevo.visualizarComponentes();
    }

}

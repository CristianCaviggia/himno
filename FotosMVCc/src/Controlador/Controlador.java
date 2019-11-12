
package Controlador;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import Model.DAOFoto;
import Model.Foto;
import View.Vista;

public class Controlador implements ActionListener {
private Vista vista;
private Foto foto = new Foto();
DAOFoto modelo = new DAOFoto();
FileInputStream stream;
int longitudBytes;
boolean hayNuevaImagen;

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }


}
public enum Acciones {
    AGREGAR_IMAGEN,
    CONSULTAR_IMAGEN,
    GUARDAR_IMAGEN,
    NUEVA_IMAGEN
}

public Controlador (Vista vista) {
this.vista = vista;
}

public void abrirFormulario() { 
vista.setTitle("Agregar imagen");
vista.setLocationRelativoTo(null);
vista.setVisible(true);
this.vista.btnAgregarImagen.setActionCommand("AGREGAR_IMAGEN");
this.vista.btnAgregarImagen.addActionListener(this);
this
}




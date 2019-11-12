/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
//se importa modelo e interfaz
import modelo.Modelo;
import vista.Vista;


public class Controlador implements ActionListener, MouseListener {
    //instancia a nuestra interfaz de usuario
    Vista vista;
    //instancia a nuestro modelo
    Modelo modelo = new Modelo();
    //se declaran en un ENUM las acciones que realiza la interfaz VISTA y posterior ejecucion desde el controlador
    public enum AccionMVC {
        VER_PRODUCTOS,
        AGREGAR_PRODUCTO,
        ELIMINAR_PRODUCTO
    }
    public Controlador (Vista vista){
        this.vista = vista;
    }
    
    //inicia el skin y las diferentes variables que se utilizan
    public void iniciar() throws InstantiationException{
        //skin tipo WINDOWS
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vista);
            vista.setVisible(true);
        } catch (UnsupportedLookAndFeelException ex){}
          catch (ClassNotFoundException ex) {}
          catch (IllegalAccessException ex) {}
        //declara una accion y añade un escucha al evento producido por el componente
        this.vista.btnVerProducto.setActionCommand("VER_PRODUCTOS");
        this.vista.btnVerProducto.addActionListener(this);
        //declara una accion y añade un escucha al evento producido por el componente
        this.vista.btnAgregarProducto.setActionCommand("AGREGAR_PRODUCTO");
        this.vista.btnAgregarProducto.addActionListener(this);
        //declara una accion y añade un escucha al evento producido por el componente
        this.vista.btnEliminarProducto.setActionCommand("ELIMINAR_PRODUCTO");
        this.vista.btnEliminarProducto.addActionListener(this);
        //añade e inicia el jlabel con un DefaultTableModel vacio
        this.vista.tblProductos.addMouseListener(this);
        this.vista.tblProductos.setModel(new DefaultTableModel());
    }
    //eventos que suceden por el mouse (boton 1 es el izquierdo)
    @Override
    public void mouseClicked(MouseEvent e){
        if (e.getButton()== 1){
            int fila = this.vista.tblProductos.rowAtPoint(e.getPoint());
            if (fila > -1){
                this.vista.txtProducto.setText(String.valueOf(this.vista.tblProductos.getValueAt(fila, 0)));
                this.vista.txtNombre.setText(String.valueOf(this.vista.tblProductos.getValueAt(fila, 1)));
                this.vista.txtPrecio.setText(String.valueOf(this.vista.tblProductos.getValueAt(fila, 2)));
                this.vista.txtCantidad.setText(String.valueOf(this.vista.tblProductos.getValueAt(fila, 3)));
            }
        }
    }
    @Override
    public void mousePressed(MouseEvent e){}
    @Override
    public void mouseReleased(MouseEvent e){}
    @Override
    public void mouseEntered(MouseEvent e){}
    @Override
    public void mouseExited(MouseEvent e){}
    //control de eventos de los controles que tienen definido un "ActionCommand"
    @Override
    public void actionPerformed(ActionEvent e){
        switch (AccionMVC.valueOf(e.getActionCommand())){
            case VER_PRODUCTOS:
                //OBTIENE DEL MODELO LOS REGISTROS EN UN dEFAULTtABLEmODEL Y LO ASIGNA EN LA VISTA
                this.vista.tblProductos.setModel(this.modelo.getTablaProducto());
                break;
            case AGREGAR_PRODUCTO:
                //añade un nuevo registro
                if (this.modelo.NuevoProducto(
                        this.vista.txtProducto.getText(),
                        this.vista.txtNombre.getText(),
                        this.vista.txtPrecio.getText(),
                        this.vista.txtCantidad.getText())){
                    this.vista.tblProductos.setModel(this.modelo.getTablaProducto());
                    JOptionPane.showMessageDialog(vista, "Exito: Nuevo registro agregado.");
                    this.vista.txtProducto.setText("");
                    this.vista.txtNombre.setText("");
                    this.vista.txtPrecio.setText("0");
                    this.vista.txtCantidad.setText("0");
                }
                else //ocurrio un error
                    JOptionPane.showMessageDialog(vista, "Error: Los datos son incorrectos.");
                break;
            case ELIMINAR_PRODUCTO:
                if (JOptionPane.showConfirmDialog(null, "Se eliminará el producto, ¿desea continuar?",
        "Eliminar Registro", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                if(this.modelo.EliminarProducto(this.vista.txtProducto.getText())){
                    this.vista.tblProductos.setModel(this.modelo.getTablaProducto());
                    JOptionPane.showMessageDialog(vista, "Exito: Registro eliminado.");
                    this.vista.txtProducto.setText("");
                    this.vista.txtNombre.setText("");
                    this.vista.txtPrecio.setText("0");
                    this.vista.txtCantidad.setText("0");
                }
                break;
        }
    }
}

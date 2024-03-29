package modelo;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Modelo extends Database {

    public Modelo() {
    }

    //obtiene registros de la tabla PRODUCTO y los devuelve en un DefaultTableModel
    public DefaultTableModel getTablaProducto() {
        DefaultTableModel tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        int registros = 0;
        String[] columNames = {"ID", "Nombre", "Precio", "Cantidad"};
        //obtiene la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(*) as total FROM producto");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y colunas que necesite
        Object[][] data = new String[registros][5];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT * FROM producto");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("id");
                data[i][1] = res.getString("nombre");
                data[i][2] = res.getString("precio");
                data[i][3] = res.getString("cantidad");
                i++;
            }
            res.close();
            //se añade la matriz de datos en el DefaulrTableModel
            tableModel.setDataVector(data, columNames);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tableModel;
    }

    //registra un nuevo producto
    public boolean NuevoProducto(String id, String nombre, String precio, String cantidad) {
        if (valida_datos(id, nombre, precio, cantidad)) {
            //se reemplaza "," por "."
            precio = precio.replace(",", ".");
            //se arma la consulta
            String q = "INSERT INTO producto (id, nombre, precio, cantidad) "
                    + "VALUES ('" + id + "', '" + nombre + "', " + precio + ", " + cantidad + ")";
            //se ejecuta la consulta
            try {
                PreparedStatement pstm = this.getConexion().prepareStatement(q);
                pstm.execute();
                pstm.close();
                return true;
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
            return false;
        } else {
            return false;
        }
    }

    //elimina un registro dado su ID -> llave primaria
        public boolean EliminarProducto(String id) {
        boolean res = false;
        //se arma la consulta
        String q = "DELETE FROM producto WHERE id='" + id + "'";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
            res = true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return res;
    }

    // metodo privado para validar datos
    private boolean valida_datos(String id, String nombre, String precio, String cantidad) {
        if (id.equals("  -   ")) {
            return false;
        } else if (nombre.length() > 0 && precio.length()>0 && cantidad.length() > 0) {
            return true;
        } else {
            return false;
        }
    }

   

}

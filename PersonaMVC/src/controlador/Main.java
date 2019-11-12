/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.Vista;

/**
 *
 * @author b8
 */
public class Main {

    public static void main(String args[]) {
        Vista v = new Vista();
        Controlador con = new Controlador(v);
        v.setVisible(true);
        v.setLocationRelativeTo(null);
        con.listar(v.tabla);
    }

}


package controlador;

import vista.Vista;

public class Main {
    public static void main (String[] args) throws InstantiationException{
        //ejecuta el controlador y este la vista
        new Controlador (new Vista()).iniciar();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherencia;

import java.util.ArrayList;
import Selección.Entrenador;
import Selección.Masajista;
import Selección.SeleccionFutbol;
import Selección.futbolista;

/**
 *
 * @author b8
 */
public class EjersicioHerenciaApp {

    //arrayList de objetos SelecionFubol.Independientemente de la clase hija a la que pertenezca el objeto.
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

    public static void main(String[] args) {
        Entrenador delBosque = new Entrenador(1, "Vivente", "Del Bosque", 60, "284EZ89");
        futbolista inesta = new futbolista(2, "Andres", "Inesta", 29, 6, "Interior Derecho");
        Masajista raulMartinez = new Masajista(3, "Raul", "Martinez", 41, "licenciado en fisioterapia", 18);
        integrantes.add(delBosque);
        integrantes.add(inesta);
        integrantes.add(raulMartinez);

//concentracion
        System.out.println("Todos los integrantes hacen la concentración.(Todos ejecutan el mismo metodo)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellido() + "→ ");
            integrante.concentrarse();
        }

        //rueda de prensa
        System.out.println("\nTodos los integrantes den una rueda de prensa");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " "+integrante.getApellido() + " → ");
          integrante.ruedaPrensa();
        }
        
        //video publicitario
        System.out.println("\nTodos los integrantes graban un video publicitario");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " "+integrante.getApellido() + " → ");
          integrante.videoPublicitario();
        }

//viajar
        System.out.println("\nTodos los integrantes viajan a jugar partido.(Todos ejecutan el mismo metodo)");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellido() + "→ ");
            integrante.viajar();
        }

//entrenamiento
        System.out.println("todos los integrantes entrenan");
        for (SeleccionFutbol integrante : integrantes) {

            System.out.print(integrante.getNombre() + " " + integrante.getApellido() + "→ ");
            integrante.entrenar();
        }

//jugar partido
        System.out.println("todos los integrantes juegan partido");
        for (SeleccionFutbol integrante : integrantes) {

            System.out.print(integrante.getNombre() + " " + integrante.getApellido() + "→ ");
            integrante.jugarPartido();
        }

//dirijir entrenamiento
        System.out.println("\n solo el entrenador dirige partido:");
        System.out.print(delBosque.getNombre() + " " + delBosque.getApellido() + "→ ");
        ((Entrenador) delBosque).dirigirEntrenamiento();

//masaje
        System.out.println("\nMasaje: Solo el masajista tiene el metodo para dar masaje:");
        System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellido() + "→ ");
        raulMartinez.darMasaje();

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosarraylistapp;
import java.util.ArrayList;





public class MetodosArrayListApp {


  
    public static void main(String[] args) {
        
        ArrayList <String> listaPaises = new ArrayList(); 
        
        
        listaPaises.add("España");
        listaPaises.add("Francia");
        listaPaises.add("Portugal");
        
        
        //Listar elementos
        for (String pais:listaPaises)
            System.out.println(pais);
        
        //Agregar un elemnto en pocicion <<<<< 1 >>>>>
        listaPaises.add(1, "Italia");
        
        //Listar elementos
        for (String pais:listaPaises)
            System.out.println(pais);
        
        //Obtener una pocicion con get()
        System.out.println (listaPaises.get(3));
        ///
        
        //Metodo for claSICO METODO SIZE() METODO get() para listar
        for (int i = 0; i < listaPaises.size() ; i++)
        System.out.println (listaPaises.get(i));
        
        //buscar elemnto con index of()
        String paisBuscado = ("Francia");
        int pos = listaPaises.indexOf(paisBuscado);
        if (pos != -1)
            System.out.println(paisBuscado + "Se encontro en poscicion" + pos);
        else
             System.out.println(paisBuscado + "No se ha encontrado");
        
        
        //remover elemnto........
        listaPaises.remove(2);
        
        
        //
        listaPaises.remove("Portugal");
         //Listar elementos
        for (String pais:listaPaises)
            System.out.println(pais);
        
                   
        }
    
}

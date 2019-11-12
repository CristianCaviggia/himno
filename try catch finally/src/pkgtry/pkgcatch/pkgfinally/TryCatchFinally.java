/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgtry.pkgcatch.pkgfinally;

/**
 *
 * @author b8
 */
public class TryCatchFinally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.println("intentamos ejecutar el bloque de instrucciones:");
            System.out.println("instruccion 1");
            int n= Integer.parseInt("M");
             System.out.println("instruccion 2");
              System.out.println("instruccion 3");
              
        }
    catch(Exception e){
         System.out.println("instrucciones a ejecutar cuando se produce un error");
         
    } 
    finally {
             System.out.println("instrucciones a ejecutar finalmente tanto si se producen errores como si no");
             
        }     
    }
    
}

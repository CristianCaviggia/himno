
package ejercicio8;

/**
 *
 * @author bruno
 */
public class EJERCICIO8 {

    
    public static void main(String[] args) {
      char ch;
      try{
          //dado que prompt()podria arrojar una excepción, su llamada debe incluirse dentro de un bloque tri-catch
          ch= prompt("Ingrese una letra");
      }catch(java.io.IOException exc){
          System.out.println("Ocurrió una excepción de E/S");
          ch= 'X'; 
      }
          System.out.println("Usted presionó:"+ ch);
      }
    

    public static char prompt(String args) throws java.io.IOException{
        System.out.println(args+":");
        return(char)System.in.read();
    }
    
}

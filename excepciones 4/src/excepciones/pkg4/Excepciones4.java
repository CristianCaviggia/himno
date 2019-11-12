
package excepciones.pkg4;


public class Excepciones4 {

    public static void main(String[] args) {
      int nums[]=new int [4]; 
      try{
          lanzarUnaException();
      }catch(ArrayIndexOutOfBoundsException exc){
          System.out.println("indice fuera de los limites");
      }
      System.out.println("despues de que se genere la excepcion");
      
      }

    public  static void lanzarUnaException() {
        int nums []= new int [4];
        System.out.println("antes de que se genere la excepcion");
        nums[7]=10;
        System.out.println("esto no se mostrara");
       
    }
    
    }
    


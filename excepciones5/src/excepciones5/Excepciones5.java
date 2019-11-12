
package excepciones5;


public class Excepciones5 {

    public static void main(String[] args) {
        try{
            muestraArray();
            
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("es una pocicion fuera del arreglo");
        }
        
    }

    public static void muestraArray() {
        int []array={4,2,6};
        for(int i=0;i<=3;i++)
        System.out.println(array[i]);       
    }
    
}

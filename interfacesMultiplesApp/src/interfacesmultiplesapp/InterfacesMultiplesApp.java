
package interfacesmultiplesapp;
import Atletas.TriAtleta;

public class InterfacesMultiplesApp {
    public static void main(String[] args) {
        TriAtleta javierNoya =new TriAtleta("javier Gomez Noya");
        TriAtleta janFrodeno =new TriAtleta("jan Frodeno");
        TriAtleta enekoLlanos =new TriAtleta("Eneko llanos");
   System.out.println(javierNoya.getNombre()+" "+javierNoya.correr());
   System.out.println(javierNoya.getNombre()+" "+javierNoya.nadar());
   System.out.println(javierNoya.getNombre()+" "+janFrodeno.haceBici());
   System.out.println(javierNoya.getNombre()+" "+janFrodeno.nadar());
   System.out.println(javierNoya.getNombre()+" "+enekoLlanos.correr());
   System.out.println(javierNoya.getNombre()+" "+enekoLlanos.haceBici());
    }
    
}

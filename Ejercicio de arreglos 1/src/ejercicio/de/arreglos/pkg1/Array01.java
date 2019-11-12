/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array01;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author b8
 */
public class Array01{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado =new Scanner(System.in);
        int[]n;// el arrreglo de números enteros nombrado como n.
        int i ;
        i = teclado.nextInt();
        n= new int[i];//se reserva un espacio para 4 numeros enteros.
        n[0]=26;
        n[1]=-30;
        n[2]=0;
        n[3]=100;
        System.out.print("los valore del array n son los siguientes: ");
        System.out.print(n[0]+","+n[1]+","+n[2]+","+n[3]);
        int suma= n[0]+ n[3];
        System.out.println("\nEl primer elemento del array mas el último suman "+ suma);
        
    }
     
}

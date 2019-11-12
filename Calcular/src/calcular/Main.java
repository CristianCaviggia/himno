package calcular;

public class Main {

    public static void main(String[] args) {
        Calcular calc = new Calcular();
        double numero1 = 10.0;
        double numero2 = 2.0;
        System.out.printf("La suma de %.2f y %.2f es %.2f%n", numero1, numero2, calc.sumar(numero1, numero2));
        System.out.printf("La resta de %.2f y %.2f es %.2f%n", numero1, numero2, calc.restar(numero1, numero2));
        System.out.printf("La multiplicacion de %.2f y %.2f es %.2f%n", numero1, numero2, calc.multiplicar(numero1, numero2));
        System.out.printf("La division de %.2f y %.2f es %.2f%n", numero1, numero2, calc.dividir(numero1, numero2));
    }
}

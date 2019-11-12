package divisibleswhileapp;

public class DivisiblesWhileApp {

    public static void main(String[] args) {
        //Divicibles por dos con while.
        System.out.println("¬Numeros divicibles por 2 entre 1 y 100:");
        int num = 1;
        while (num <= 100) {
            if (num % 2 == 0) {
                System.out.println(num);

            }
            num++;

        }
        System.out.println("¬Numeros divicibles por 3 entre 1 y 100:");
        //Divisibles por 3 con for.
        for (int num1 = 1; num1 <= 100; num1++) {
            if (num1 % 3 == 0) {
                System.out.println(num1);
            }
        }
    }

}

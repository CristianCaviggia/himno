
public class ClassFactorial {

    public static int factorial(int n) throws IllegalArgumentException {
        int factorial = 1;
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n > 0) {
            /**
             * factorial = n * factorial(n-1); Aplicaremos el calculo del
             * factorial de manera iterativa en vista de que consume menos
             * memoria
             */
            for (int i = 2; i <= n; i++) 
                factorial *= i;
        }
            return factorial;
        }
}    

package excepciones6;

public class Excepciones6 {

    public static void main(String[] args) {
        int nums[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};
        for (int i = 0; i < nums.length; i++) {
            try {
                System.out.println(nums[i] + "/" + denom[i] + "es " + nums[i] / denom[i]);

            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("no se encontro ningun elemento");
            } catch (Exception exc) {
                System.out.println("alguna excepcion ocurrio");
            }
        }

    }

}

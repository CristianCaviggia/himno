package supermercado;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cliente 1", new int[]{2, 2, 1, 5, 2, 3});
        Cliente cliente2 = new Cliente("Cliente 2", new int[]{1, 3, 5, 1, 1});
        Cliente cliente3 = new Cliente("Cliente 3", new int[]{2, 3, 1, 2});
        Cliente cliente4 = new Cliente("Cliente 4", new int[]{2, 2, 2, 2, 2});
        Cliente cliente5 = new Cliente("Cliente 5", new int[]{2, 4, 5, 1, 2});
        Cliente cliente6 = new Cliente("Cliente 6", new int[]{2, 2, 6,});
        Cliente cliente7 = new Cliente("Cliente 7", new int[]{4, 2, 2, 4});
        Cliente cliente8 = new Cliente("Cliente 8", new int[]{1, 2, 1, 5});
        Cliente cliente9 = new Cliente("Cliente 9", new int[]{1, 1, 1, 7});
        Cliente cliente10 = new Cliente("Cliente 10", new int[]{1, 1, 3, 2});

        Cajera cajera1 = new Cajera("Betiana");
        Cajera cajera2 = new Cajera("Yanina");
        Cajera cajera3 = new Cajera("Florencia");
        Cajera cajera4 = new Cajera("Analia");

        //Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();

        cajera1.procesarCompra(cliente1, initialTime);
        cajera1.procesarCompra(cliente2, initialTime);
        cajera2.procesarCompra(cliente3, initialTime);
        cajera3.procesarCompra(cliente4, initialTime);
        cajera3.procesarCompra(cliente5, initialTime);
        cajera2.procesarCompra(cliente6, initialTime);
        cajera3.procesarCompra(cliente7, initialTime);
        cajera1.procesarCompra(cliente8, initialTime);
        cajera4.procesarCompra(cliente9, initialTime);
        cajera4.procesarCompra(cliente10, initialTime);

    }

}

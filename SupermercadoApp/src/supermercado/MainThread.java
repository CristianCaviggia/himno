package supermercado;

import java.util.ArrayList;

public class MainThread {

    public static void main(String[] args) {

        ArrayList<Cliente> clientesCaja1 = new ArrayList();
        ArrayList<Cliente> clientesCaja2 = new ArrayList();
        ArrayList<Cliente> clientesCaja3 = new ArrayList();
        ArrayList<Cliente> clientesCaja4 = new ArrayList();

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

        clientesCaja1.add(cliente1);
        clientesCaja1.add(cliente5);
        clientesCaja2.add(cliente2);
        clientesCaja3.add(cliente3);
        clientesCaja3.add(cliente4);
        clientesCaja2.add(cliente6);
        clientesCaja1.add(cliente7);
        clientesCaja3.add(cliente8);
        clientesCaja4.add(cliente9);
        clientesCaja4.add(cliente10);
        //...

        //Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();
        CajeraThread cajera1 = new CajeraThread("Betiana", clientesCaja1, initialTime);
        CajeraThread cajera2 = new CajeraThread("Yanina", clientesCaja2, initialTime);
        CajeraThread cajera3 = new CajeraThread("Florencia", clientesCaja3, initialTime);
        CajeraThread cajera4 = new CajeraThread("Analia", clientesCaja4, initialTime);

        cajera1.start();
        cajera2.start();
        cajera3.start();
        cajera4.start();

    }

}

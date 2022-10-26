package expendedora_de_bebidas;

import java.util.ArrayList;

public class Deposito {

    private ArrayList<Bebida> Bebidas;

    public Deposito() {
        Bebidas = new ArrayList();
    }

    public void addBebida(Bebida x) {
        Bebidas.add(x);
    }
}

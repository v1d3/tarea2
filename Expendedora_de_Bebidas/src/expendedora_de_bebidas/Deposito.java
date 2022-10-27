package expendedora_de_bebidas;

import java.util.ArrayList;

public class Deposito {

    private ArrayList<Bebida> Bebidas;

    public Deposito() {
        Bebidas = new ArrayList();
    }

    public void addBebida(Bebida b) {
        Bebidas.add(b);
    }

    public Bebida getBebida() {
        if (Bebidas.size() <= 0) {
            return null;
        } else {
            Bebida b = Bebidas.remove(0);
            return b;
        }
    }
}

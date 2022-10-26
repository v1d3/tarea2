package expendedora_de_bebidas;

public class Expendedor {

    private Deposito Fanta;
    private Deposito Sprite;
    private Deposito Coca;
    private Deposito Moneda;
    private int PrecioBebidas;

    public Expendedor(int numBebidas, int PrecioBebidas) {
        Bebida b;
        Fanta = new Deposito();
        Sprite = new Deposito();
        Coca = new Deposito();
        for (int i = 0; i < numBebidas; i++) {

        }
    }

    public void ComprarBebida(Moneda m, int TipoDeBebida) {

    }

    public void getVuelto() {

    }
}

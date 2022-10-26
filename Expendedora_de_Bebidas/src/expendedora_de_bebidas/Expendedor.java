package expendedora_de_bebidas;

public class Expendedor {

    private Deposito Fanta;
    private Deposito Sprite;
    private Deposito Coca;
    private Deposito Moneda;
    private int PrecioBebidas;
    private static int fanta = 1;
    private static int sprite = 2;
    private static int cocacola = 3;

    public Expendedor(int numBebidas, int PrecioBebidas) {
        Fanta = new Deposito();
        Sprite = new Deposito();
        Coca = new Deposito();
        for (int i = 0; i < numBebidas; i++) {
            Fanta.addBebida(new Fanta(100 + i));
        }
        for (int i = 0; i < numBebidas; i++) {
            Sprite.addBebida(new Sprite(200 + i));
        }
        for (int i = 0; i < numBebidas; i++) {
            Coca.addBebida(new CocaCola(300 + i));
        }
    }

    public void ComprarBebida(Moneda m, int TipoDeBebida) {
        Bebida b = null;
        if (m != null) {    //Dinero != de null
            if (m.getValor() - PrecioBebidas >= 0) {    //Dinero > Precio
                if (TipoDeBebida == 1) {                       //Tipo de Bebida
                    b = Fanta.getBebida();
                } else if (TipoDeBebida == 2) {
                    b = Sprite.getBebida();
                } else if (TipoDeBebida == 3) {
                    b = Coca.getBebida();
                }
            }
            else {
                
            }
        }
    }

    public void getVuelto() {

    }
}

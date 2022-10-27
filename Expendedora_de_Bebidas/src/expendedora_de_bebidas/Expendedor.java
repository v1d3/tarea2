package expendedora_de_bebidas;

import java.util.ArrayList;

public class Expendedor {

    private Deposito Fanta;
    private Deposito Sprite;
    private Deposito Coca;
    private Deposito Moneda;
    private int PrecioBebidas;
    private ArrayList<Moneda> DepositoMonedas; //Para generar el vuelto
    private static int fanta = 1;
    private static int sprite = 2;
    private static int cocacola = 3;

    public Expendedor(int numBebidas, int Precio) {
        DepositoMonedas = new ArrayList();
        PrecioBebidas = Precio;
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

    public Bebida ComprarBebida(Moneda m, int TipoDeBebida) throws NoHayBebidaException, PagoInsuficienteException, PagoIncorrectoException {
        Bebida b = null;
        if (m != null) {    //Dinero != de null
            if (m.getValor() - PrecioBebidas >= 0) {    //Dinero > Precio
                if (TipoDeBebida == 1) {                      //Tipo de Bebida 
                    b = Fanta.getBebida();
                } else if (TipoDeBebida == 2) {
                    b = Sprite.getBebida();
                } else if (TipoDeBebida == 3) {
                    b = Coca.getBebida();
                } else {              //Si el numero de deposito es distinto a 1, 2 o 3
                    throw new NoHayBebidaException("NoHayBebidaException");
                }
                if (b != null) { //Si hay bebida en algun deposito
                    for (int i = 100; i <= m.getValor() - PrecioBebidas; i = i + 100) {  //Agregar el sobrante (Vuelto en el futuro) a un array para luego obtenerlo en monedas de 100
                        DepositoMonedas.add(new Moneda100() );
                    }
                }
            } else {     //Dinero < Precio
                throw new PagoInsuficienteException("Dinero insuficiente");
            }
        } else {    //Dinero == null
            throw new PagoIncorrectoException(" Pago Incorrecto");
        }
        return b;
    }

    public Moneda getVuelto() {
        if (DepositoMonedas.size() > 0) {
            return DepositoMonedas.remove(0);
        } else {
            return null;
        }
    }
}

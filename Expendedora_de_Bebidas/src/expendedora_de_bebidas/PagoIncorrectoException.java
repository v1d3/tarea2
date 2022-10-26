package expendedora_de_bebidas;

public class PagoIncorrectoException extends RuntimeException {

    public PagoIncorrectoException(String errorMessage) {

        super(errorMessage);
    }

}

///////////////////////////
//escribir en expendedor 
class MyMethod2 {

    public void SinDinero(Moneda m) throws PagoIncorrectoException {

        if (m == null) {
            throw new PagoIncorrectoException(" Pago Incorrecto");
        }
    }
}

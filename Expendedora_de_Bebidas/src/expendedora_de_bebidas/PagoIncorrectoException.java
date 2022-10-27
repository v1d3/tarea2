package expendedora_de_bebidas;

public class PagoIncorrectoException extends RuntimeException {

    public PagoIncorrectoException(String errorMessage) {

        super(errorMessage);
    }

}

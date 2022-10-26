package pagoincorrectoexception;

public class PagoIncorrectoException extends RuntimeException {

    public PagoIncorrectoException(String errorMessage) {

        super(errorMessage);
    }

}

///////////////////////////
//escribir en expendedor 
public void myMethod() throws PagoIncorrectoException{

     if (...){

     throw new PagoIncorrectoException(" Pago Incorrecto: " +  );
     }
}

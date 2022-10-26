package pagoinsuficienteexception;

public class PagoInsuficienteException extends RuntimeException {

    public PagoInsuficienteException(String errorMessage) {

        super(errorMessage);

    }
}
///////////////////////////
//escribir en expendedor 
public void myMethod() throws PagoInsuficienteException{

     if (...){

     throw new PagoInsuficienteException(" Pago Insuficiente : " +  );

}

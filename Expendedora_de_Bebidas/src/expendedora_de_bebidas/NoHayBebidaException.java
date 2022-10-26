package expendedora_de_bebidas;

public class NoHayBebidaException extends RuntimeException {

    public NoHayBebidaException(String message) {

        super(message);
    }
}

//escribir en expendedor 
class MyMethod {
    public void NoBebidas(Deposito p) throws NoHayBebidaException{
        if(p.getBebida() == null ){
            throw new NoHayBebidaException("Se acabaron las Bebidas");
        }
    }
}

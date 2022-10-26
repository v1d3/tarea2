package nohaybebidaexception;

public class NoHayBebidaException extends RuntimeException{

    public NoHayBebidaException(String errorMessage) {

        super(errorMessage);

    }
}


///////////////////////////
//escribir en expendedor 
public void myMethod() throws NoHayBebidaException{



     if (...){

     throw new NombreArchivoIncorrectoException(" No hay Bebida: " + NombreArchivo );

}
}
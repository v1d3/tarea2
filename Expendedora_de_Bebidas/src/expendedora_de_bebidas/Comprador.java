package expendedora_de_bebidas;

public class Comprador {

    private Bebida b;
    private int vuelto;

    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
        b = exp.ComprarBebida(m, cualBebida);
        vuelto = 0;
        if (m != null) {
            m = exp.getVuelto();
            while (m != null) {
                vuelto = vuelto + m.getValor();
                m = exp.getVuelto();
            }
        }
    }

    public int cuantoVuelto() {
        return vuelto;
    }

    public String queBebiste() {
        if (b != null) {
            return b.beber();
        } else {
            return null;
        }
    }
}

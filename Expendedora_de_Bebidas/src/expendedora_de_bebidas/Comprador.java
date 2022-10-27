package expendedora_de_bebidas;

public class Comprador {

    private Bebida b;
    private int vuelto;

    public Comprador(Moneda m, int cualBebida, Expendedor ex) {
        b = ex.ComprarBebida(m, cualBebida);
        vuelto = 0;
        if (m != null) {
            m = ex.getVuelto();
            while (m != null) {
                vuelto = vuelto + m.getValor();
                m = ex.getVuelto();
            }
        }
    }

    public int VueltoObtenido() {
        return vuelto;
    }

    public String TipoBebida() {
        if (b != null) {
            return b.beber();
        } else {
            return null;
        }
    }
}

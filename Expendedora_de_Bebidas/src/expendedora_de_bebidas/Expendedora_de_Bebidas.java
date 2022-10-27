package expendedora_de_bebidas;

import java.util.ArrayList;

public class Expendedora_de_Bebidas {

    public static void main(String[] args) {
        //Expendedor---------------------------------------
        Expendedor e = new Expendedor(3, 1000);
        Expendedor e1 = new Expendedor(0, 1000);
        //Monedas-------------------------------------------
        Moneda100 m = null;
        Moneda100 m1 = new Moneda100();
        Moneda500 m2 = new Moneda500();
        Moneda1000 m3 = new Moneda1000();
        Moneda1500 m4 = new Moneda1500();
        //Compradores-------------------------------------
        Comprador c1 = new Comprador(m4, 1, e); //Valor superio
        Comprador c2 = new Comprador(m3, 1, e); //Valor igual
        Comprador c3 = new Comprador(m2, 1, e); //Valor inferior
        Comprador c4 = new Comprador(m, 1, e); //Valor Nulo
        Comprador c5 = new Comprador(m4, 1, e); //No hay Bebida

    }

}

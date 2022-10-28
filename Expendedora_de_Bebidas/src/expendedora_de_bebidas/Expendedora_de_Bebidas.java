package expendedora_de_bebidas;

import java.util.ArrayList;

public class Expendedora_de_Bebidas {

    public static void main(String[] args) {
        //Monedas-------------------------------------------
        Moneda100 m = null;
        Moneda100 m1 = new Moneda100();
        Moneda500 m2 = new Moneda500();
        Moneda1000 m3 = new Moneda1000();
        Moneda1500 m4 = new Moneda1500();
        //Expendedor---------------------------------------
        Expendedor e = new Expendedor(3, 1500);
        Expendedor e1 = new Expendedor(0, 1000);    //Sin Bebidas
        Expendedor e2 = new Expendedor(3, 500);
        //Compradores-------------------------------------
        Comprador c1 = new Comprador(m4, 1, e2); //Valor superio
        System.out.println("Vuelto: " + c1.CuantoVuelto());
        System.out.println("Que Bebiste?: " + c1.queBebiste());

        Comprador c2 = new Comprador(m4, 2, e); //Valor igual
        System.out.println("Vuelto: " + c2.CuantoVuelto());
        System.out.println("Que Bebiste?: " + c2.queBebiste());

        Comprador c3 = new Comprador(m2, 3, e); //Valor inferior
        System.out.println("Vuelto: " + c3.CuantoVuelto());
        System.out.println("Que Bebiste?: " + c3.queBebiste());

        Comprador c4 = new Comprador(m, 2, e); //Valor Nulo
        System.out.println("Vuelto: " + c4.CuantoVuelto());
        System.out.println("Que Bebiste?: " + c4.queBebiste());

        Comprador c5 = new Comprador(m4, 3, e1); //No hay Bebida
        System.out.println("Vuelto: " + c5.CuantoVuelto());
        System.out.println("Que Bebiste?: " + c5.queBebiste());
    }

}

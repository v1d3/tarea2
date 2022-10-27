package expendedora_de_bebidas;
import java.util.ArrayList;
public class Expendedora_de_Bebidas {

    
    public static void main(String[] args) {
        Expendedor exp1 = new Expendedor(1,500); // numero de bebidas a crear, el precio de las bebidas
        
        
        Moneda100 m100 = new Moneda100();
        Moneda500 m500 = new Moneda500();
        Moneda1000 m1000 = new Moneda1000();
        Moneda1500 m1500 = new Moneda1500();
        Moneda100 m = null;
        
        
        // 1 CocaCola, 2 Sprite
        // C1 - Moneda que es superior al valor de la bebida
        Comprador C1 = new Comprador(m1500, 1, exp1);
        System.out.println("Comprador 1, Moneda > valor de la Bebida:"); 
        System.out.println( C1.cuantoVuelto() );
        System.out.println( C1.queBebiste() );
        
        // C2 - Moneda con el mismo valor al de la bebida
        Comprador C2 = new Comprador(m500, 2, exp1); 
        System.out.println(" \nComprador 2, Moneda = valor de la Bebida:"); 
        System.out.println( C2.cuantoVuelto() );
        System.out.println( C2.queBebiste() );
        
        // C3 - Con moneda pero la bebida no existe
        Comprador C3 = new Comprador(m1000, 2, exp1); 
        System.out.println(" \nComprador 3, Bebida no existe:"); 
        System.out.println( C3.cuantoVuelto() );
        System.out.println( C3.queBebiste() );
        
        // C4 - Moneda de valor inferior al de la bebida
        Comprador C4 = new Comprador(m100, 2, exp1); 
        System.out.println(" \nComprador 4, Moneda < valor de la Bebida "); 
        System.out.println( C4.cuantoVuelto() );
        System.out.println( C4.queBebiste() );
        
        // C5 - Sin moneda, m == null
        Comprador C5 = new Comprador(m, 2, exp1); 
        System.out.println(" \nComprador 5, sin moneda "); 
        System.out.println( C5.cuantoVuelto() );
        System.out.println( C5.queBebiste() );
    }
    
}

package expendedora_de_bebidas;

abstract class Bebida {

    private int serie;

    public Bebida(int numSerie) {
        this.serie = numSerie;
    }

    public int getSerie() {
        return serie;
    }

    public abstract String beber();

}

class CocaCola extends Bebida {

    public CocaCola(int serie) {
        super(serie);
    }

    public String beber() {
        return "CocaCola";
    }
}

class Sprite extends Bebida {

    public Sprite(int serie) {
        super(serie);
    }

    public String beber() {
        return "Sprite";
    }
}

class Fanta extends Bebida {

    public Fanta(int serie) {
        super(serie);
    }

    public String beber() {
        return "Fanta";
    }
}

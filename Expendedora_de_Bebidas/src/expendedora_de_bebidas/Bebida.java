package expendedora_de_bebidas;

abstract class Bebida {

    public Bebida() {

    }

    public String Beber() {
        return "Glu glu glu... deliciosa: ";
    }
}

class Fanta extends Bebida {

    public Fanta() {

    }

    public String Beber() {
        return super.Beber() + "Fanta";
    }
}

class Sprite extends Bebida {

    public Sprite() {

    }

    public String Beber() {
        return super.Beber() + "Sprite";
    }
}

class CocaCola extends Bebida {

    public CocaCola() {

    }

    public String Beber() {
        return super.Beber() + "CocaCola";
    }
}

package decorador;

import decorador.bebida.Bebida;

/*
 Decorador que agrega crema Whip.
*/
public class Whip extends CondimentoDecorador {

    Bebida bebida;

    public Whip(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Whip";
    }

    @Override
    public double costo() {
        return bebida.costo() + 7.0;
    }
}
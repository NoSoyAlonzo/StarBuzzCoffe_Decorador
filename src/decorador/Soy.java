package decorador;

import decorador.bebida.Bebida;

/*
 Decorador que agrega Soy.
*/
public class Soy extends CondimentoDecorador {

    Bebida bebida;

    public Soy(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Soy";
    }

    @Override
    public double costo() {
        return bebida.costo() + 8.0;
    }
}
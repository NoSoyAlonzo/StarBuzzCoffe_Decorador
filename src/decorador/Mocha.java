package decorador;


import decorador.bebida.Bebida;

/*
 Decorador que agrega Mocha a una bebida.
*/
public class Mocha extends CondimentoDecorador {

    Bebida bebida;

    public Mocha(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Mocha";
    }

    @Override
    public double costo() {
        return bebida.costo() + 10.0;
    }
}
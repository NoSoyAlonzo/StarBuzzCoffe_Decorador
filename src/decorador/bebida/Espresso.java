package decorador.bebida;

/*
 Representa una bebida Espresso.
*/
public class Espresso extends Bebida {

    public Espresso() {
        descripcion = "Espresso";
    }

    @Override
    public double costo() {
        return 45.0;
    }
}
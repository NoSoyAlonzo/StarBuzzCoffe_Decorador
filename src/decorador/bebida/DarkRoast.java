package decorador.bebida;

/*
 Representa café Dark Roast.
*/
public class DarkRoast extends Bebida {

    public DarkRoast() {
        descripcion = "Dark Roast";
    }

    @Override
    public double costo() {
        return 40.0;
    }
}
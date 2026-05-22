package decorador.bebida;
/*
 Representa café House Blend.
*/
public class HouseBlend extends Bebida {

    public HouseBlend() {
        descripcion = "House Blend";
    }

    @Override
    public double costo() {
        return 35.0;
    }
}
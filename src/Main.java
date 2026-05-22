import decorador.Mocha;
import decorador.Soy;
import decorador.Whip;
import decorador.bebida.Bebida;
import decorador.bebida.DarkRoast;
import decorador.bebida.Espresso;
import decorador.bebida.HouseBlend;

/*
 Clase principal para ejecutar el sistema Starbuzz Coffee.
 Demuestra el patrón Decorador.
*/
public class Main {

    public static void main(String[] args) {

        // Espresso simple
        Bebida bebida1 = new Espresso();

        System.out.println(
                bebida1.getDescripcion()
                        + " $"
                        + bebida1.costo()
        );

        // DarkRoast + Mocha + Whip
        Bebida bebida2 = new DarkRoast();

        bebida2 = new Mocha(bebida2);
        bebida2 = new Whip(bebida2);

        System.out.println(
                bebida2.getDescripcion()
                        + " $"
                        + bebida2.costo()
        );

        // HouseBlend + Soy + Mocha + Whip
        Bebida bebida3 = new HouseBlend();

        bebida3 = new Soy(bebida3);
        bebida3 = new Mocha(bebida3);
        bebida3 = new Whip(bebida3);

        System.out.println(
                bebida3.getDescripcion()
                        + " $"
                        + bebida3.costo()
        );
    }
}
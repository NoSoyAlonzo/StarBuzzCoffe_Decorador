package decorador.bebida;

/*
 Clase base abstracta para todas las bebidas.
 Define descripción y costo.
*/
public abstract class Bebida {

    String descripcion = "Bebida desconocida";

    public String getDescripcion() {
        return descripcion;
    }

    public abstract double costo();
}
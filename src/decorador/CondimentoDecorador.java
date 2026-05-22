package decorador;

import decorador.bebida.Bebida;

/*
 Clase abstracta decoradora.
 Todos los condimentos heredarán de aquí.
*/
public abstract class CondimentoDecorador extends Bebida {

    public abstract String getDescripcion();
}
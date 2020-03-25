package Ejercicio1.Exceptions;

public class NearException extends Exception {
    public NearException(Boolean isGreater) {
        super(String.format("Usted no ha acertado, debe ingresar un número %s al ingresado",
                isGreater ? "menor" : "mayor"));
    }
}

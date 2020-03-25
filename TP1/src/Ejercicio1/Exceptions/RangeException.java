package Ejercicio1.Exceptions;

public class RangeException extends Exception {
    public RangeException(Long minimum, Long maximum) {
        super(String.format("Debes ingresar un número dentro del rango (%s - %s)", minimum, maximum));
    }
}

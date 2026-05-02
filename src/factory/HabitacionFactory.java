package factory;

import domain.Habitacion;
import domain.Simple;
import domain.Suite;

public class HabitacionFactory {
    public static Habitacion crearHabitacion(String tipo, int numero, double precio) {
        switch (tipo.toLowerCase()) {
            case "simple":
                return new Simple(numero, precio);
            case "suite":
                return new Suite(numero, precio);
            default:
                throw new IllegalArgumentException("Tipo de habitación no válido");
        }
    }
}

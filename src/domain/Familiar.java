package domain;

public class Familiar extends Habitacion{
    public Familiar(int numero, double precioBase) {
        super(numero, precioBase);
    }

    @Override
    public double calcularPrecio() {
        return precioBase * 1.2;
    }
}

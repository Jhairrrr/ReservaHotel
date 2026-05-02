package domain;

public class Suite extends Habitacion{
    public Suite(int numero, double precioBase) {
        super(numero, precioBase);
    }

    @Override
    public double calcularPrecio() {
        return precioBase * 1.5;
    }
}

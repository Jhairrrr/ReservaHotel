package domain;

public class Simple extends Habitacion{

    public Simple(int numero, double precioBase) {
        super(numero, precioBase);
    }

    @Override
    public double calcularPrecio() {
        return precioBase;
    }
}

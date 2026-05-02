package domain;

public abstract class Habitacion {
    protected int numero;
    protected double precioBase;

    public Habitacion(int numero, double precioBase) {
        this.numero = numero;
        this.precioBase = precioBase;
    }

    public abstract double calcularPrecio();

    public int getNumero() {
        return numero;
    }
}

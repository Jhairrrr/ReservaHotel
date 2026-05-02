package domain;

import strategy.PagoStrategy;

public class Reserva {
    private Cliente cliente;
    private Habitacion habitacion;
    private PagoStrategy pago;

    public Reserva(Cliente cliente, Habitacion habitacion, PagoStrategy pago) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.pago = pago;
    }

    public double calcularCosto() {
        return habitacion.calcularPrecio();
    }

    public void pagar() {
        pago.pagar(calcularCosto());
    }

    public Cliente getCliente() {
        return cliente;
    }
}

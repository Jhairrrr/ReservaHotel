package strategy;

public class PagoTarjeta implements PagoStrategy{
    @Override
    public void pagar(double monto) {
        System.out.println("Pago con tarjeta " +monto);
    }
}

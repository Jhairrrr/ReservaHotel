package strategy;

public class PagoEfecivo implements PagoStrategy{
    @Override
    public void pagar(double monto) {
        System.out.println("Pago con efectivo " +monto);
    }
}

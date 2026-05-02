import domain.*;
import strategy.*;
import factory.*;
import repository.*;
import infrastucture.*;
import service.*;

public class Main {
    public static void main(String[] args) {

        // Crear cliente
        Cliente cliente = new Cliente(1, "Juan Perez");

        // Factory → crear habitación
        Habitacion habitacion = HabitacionFactory.crearHabitacion("suite", 101, 200);

        // Strategy → método de pago
        PagoStrategy pago = new PagoTarjeta();

        // Crear reserva
        Reserva reserva = new Reserva(cliente, habitacion, pago);

        // Infraestructura
        Database db = new Database();

        ReservarRepository reservaRepo = new MySQLReservaRepository(db);
        ClienteRepository clienteRepo = new MySQLClienteRepository(db);

        // Servicios
        ReservaService reservaService = new ReservaService(reservaRepo);
        ClienteService clienteService = new ClienteService(clienteRepo);

        // Ejecutar flujo
        clienteService.RegistrarCliente(cliente);
        reservaService.crearReserva(reserva);

        reserva.pagar();
    }

}

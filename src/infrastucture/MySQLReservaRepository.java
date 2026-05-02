package infrastucture;

import domain.Reserva;
import repository.ReservarRepository;

public class MySQLReservaRepository implements ReservarRepository {
    private Database db;

    public MySQLReservaRepository(Database db) {
        this.db = db;
    }

    @Override
    public void guardar(Reserva reserva) {
        System.out.println("Reserva guradada para " + reserva.getCliente().getNombre());
    }
}

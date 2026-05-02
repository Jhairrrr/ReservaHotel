package infrastucture;

import domain.Cliente;
import repository.ClienteRepository;

public class MySQLClienteRepository implements ClienteRepository {
    public Database db;

    public MySQLClienteRepository(Database db) {
        this.db = db;
    }

    @Override
    public void guardar(Cliente cliente) {
        System.out.println("Cliente guardado " +cliente.getNombre());
    }
}

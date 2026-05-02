package service;

import domain.Cliente;
import repository.ClienteRepository;

public class ClienteService {
    private ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }
    public void RegistrarCliente(Cliente cliente){
        repository.guardar(cliente);
    }
}

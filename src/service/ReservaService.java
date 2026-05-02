package service;


import domain.Reserva;
import repository.ReservarRepository;


public class ReservaService {
    private ReservarRepository repository;

    public ReservaService(ReservarRepository repository) {
        this.repository = repository;
    }
    public void crearReserva(Reserva reserva){
        repository.guardar( reserva);
    }
}

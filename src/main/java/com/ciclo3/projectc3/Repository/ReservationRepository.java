package com.ciclo3.projectc3.Repository;

import com.ciclo3.projectc3.Model.Reservation;
import com.ciclo3.projectc3.Repository.CrudRepository.ReservationCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository {
    @Autowired
    private ReservationCrudRepository extencionesCrud;

    public List<Reservation> getAll(){
        return (List<Reservation>) extencionesCrud.findAll();
    }

    public Optional<Reservation> getReservation(int id){
        return extencionesCrud.findById(id);
    }

    public Reservation save(Reservation reservation){
        return extencionesCrud.save(reservation);
    }


}

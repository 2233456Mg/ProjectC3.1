package com.ciclo3.projectc3.Repository.CrudRepository;

import com.ciclo3.projectc3.Entities.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
}

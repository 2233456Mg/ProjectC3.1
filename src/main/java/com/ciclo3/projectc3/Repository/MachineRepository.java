package com.ciclo3.projectc3.Repository;

import com.ciclo3.projectc3.Model.Machine;
import com.ciclo3.projectc3.Repository.CrudRepository.MachineCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MachineRepository {
    @Autowired
    private MachineCrudRepository extencionesCrud;

    public List<Machine> getAll(){
        return (List<Machine>) extencionesCrud.findAll();
    }

    public Optional<Machine> getMachine(int id){
        return extencionesCrud.findById(id);
    }

    public Machine save(Machine machine){
        return extencionesCrud.save(machine);
    }
}

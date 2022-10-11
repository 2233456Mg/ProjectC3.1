package com.ciclo3.projectc3.Service;

import com.ciclo3.projectc3.Model.Machine;
import com.ciclo3.projectc3.Repository.MachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MachineService {

    @Autowired
    private MachineRepository machineRepository;

    public List<Machine> getAll(){
        return machineRepository.getAll();
    }

    public Optional<Machine> getMachine(int id){
        return machineRepository.getMachine(id);
    }

    public Machine save (Machine machine){
        if (machine.getId() == null){
            return machineRepository.save(machine);
        } else {
            Optional<Machine> machine1 = machineRepository.getMachine(machine.getId());
            if(machine1.isEmpty()){
                return machineRepository.save(machine);
            } else {
                return machine;
            }
        }
    }

}

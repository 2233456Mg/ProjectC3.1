package com.ciclo3.projectc3.Repository;

import com.ciclo3.projectc3.Model.Admin;
import com.ciclo3.projectc3.Repository.CrudRepository.AdminCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AdminRepository {

    @Autowired
    private AdminCrudRepository extencionesCrud;

    public List<Admin> getAll(){
        return (List<Admin>) extencionesCrud.findAll();
    }

    public Optional<Admin> getAdmin(int id){
        return extencionesCrud.findById(id);
    }

    public Admin save(Admin admin){
        return extencionesCrud.save(admin);
    }
}

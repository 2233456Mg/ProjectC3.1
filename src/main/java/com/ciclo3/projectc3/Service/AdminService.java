package com.ciclo3.projectc3.Service;

import com.ciclo3.projectc3.Entities.Admin;
import com.ciclo3.projectc3.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public List<Admin> getAll(){
        return adminRepository.getAll();
    }

    public Optional<Admin> getAdmin(int id){
        return adminRepository.getAdmin(id);
    }

    public Admin save (Admin admin){
        if (admin.getId() == null){
            return adminRepository.save(admin);
        } else {
            Optional<Admin> admin1 = adminRepository.getAdmin(admin.getId());
            if(admin1.isPresent()){
                return adminRepository.save(admin);
            } else {
                return admin;
            }
        }
    }

}

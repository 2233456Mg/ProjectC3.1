package com.ciclo3.projectc3.Repository;

import com.ciclo3.projectc3.Model.Category;
import com.ciclo3.projectc3.Repository.CrudRepository.CategoryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepository {
    @Autowired
    private CategoryCrudRepository extencionesCrud;

    public List<Category> getAll(){
        return (List<Category>) extencionesCrud.findAll();
    }

    public Optional<Category> getCategory(int id){
        return extencionesCrud.findById(id);
    }

    public Category save(Category category){
        return extencionesCrud.save(category);
    }
}

package com.ciclo3.projectc3.Repository;

import com.ciclo3.projectc3.Model.Message;
import com.ciclo3.projectc3.Repository.CrudRepository.MessageCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MessageRepository {

    @Autowired
    private MessageCrudRepository extencionesCrud;

    public List<Message> getAll(){
        return (List<Message>) extencionesCrud.findAll();
    }

    public Optional<Message> getMessage(int id){
        return extencionesCrud.findById(id);
    }

    public Message save(Message message){
        return extencionesCrud.save(message);
    }
}

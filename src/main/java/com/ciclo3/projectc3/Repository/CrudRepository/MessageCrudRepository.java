package com.ciclo3.projectc3.Repository.CrudRepository;

import com.ciclo3.projectc3.Model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}

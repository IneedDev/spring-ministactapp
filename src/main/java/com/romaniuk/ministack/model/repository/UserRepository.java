package com.romaniuk.ministack.model.repository;

import com.romaniuk.ministack.model.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository <UserEntity, Integer> {

    //adnotacja Query umozliwia definiowanie w tym miejscu prepared statemnts
}

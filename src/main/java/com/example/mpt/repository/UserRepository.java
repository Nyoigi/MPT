package com.example.mpt.repository;

import com.example.mpt.model.Tb_user;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Tb_user, Long> {
    Tb_user findByNameUser(String nameUser);
}

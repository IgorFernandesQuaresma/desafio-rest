package com.desafioRest.desafio_rest.domain.repository;

import com.desafioRest.desafio_rest.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long > {
}

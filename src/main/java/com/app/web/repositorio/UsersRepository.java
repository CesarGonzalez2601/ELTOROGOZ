package com.app.web.repositorio;

import com.app.web.entidad.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository <Users, Integer>{

    Optional<Users> findByUsername(String correoUsuario);

}

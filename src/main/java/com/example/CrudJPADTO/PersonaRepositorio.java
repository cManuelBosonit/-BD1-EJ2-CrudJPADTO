package com.example.CrudJPADTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;


public interface PersonaRepositorio extends JpaRepository<Persona, Integer> {

    Persona findByUsuario(String usuario);

}

package com.example.CrudJPADTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controlador {

    @Autowired
    Servicio servicio;

    //POST
    //Añade personas a la BBDD
    /*localhost:8080/persona
    {
        "usuario": "Usuario1",
        "password": "seguro",
        "name": "Manuel",
        "surname": "Hernández",
        "company_email": "MH@email.com",
        "personal_email": "MHpersonal@email.com",
        "city": "Madrid",
        "active": true,
        "created_date": "2022-02-07",
        "imagen_url": "url",
        "termination_date": "2022-02-07"
    }
     */
    @PostMapping("/persona")
    public PersonaDTO crearPersona(@RequestBody PersonaDTO personaDTO){
        servicio.crearPersona(personaDTO);
        return personaDTO;
    }

    //GET
    //Busca personas por ID
    //localhost:8080/persona/id/1
    @GetMapping("/persona/id/{id_persona}")
    public Persona buscarPorId(@PathVariable int id_persona) throws Exception{
        return servicio.buscarPorId(id_persona);
    }

    //GET
    //Busca personas por Usuario
    //localhost:8080/persona/usuario/Usuario1
    @GetMapping("/persona/usuario/{usuario}")
    public Persona getByUser(@PathVariable String usuario) {
        return servicio.findByUsuario(usuario);
    }

    @GetMapping("/persona")
    public List<Persona> getAll(){
        return servicio.devolverPersonas();
    }
}

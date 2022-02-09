package com.example.CrudJPADTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Servicio {

    @Autowired
    PersonaRepositorio personaRepositorio;

    public void crearPersona(PersonaDTO personaDTO){

        if (personaDTO.getUsuario()==null)
            throw new RuntimeException("Usuario no puede ser nulo");

        if (personaDTO.getUsuario().length()>10 || personaDTO.getUsuario().length() <6)
            throw new RuntimeException("La longitud de usuario debe ser entre 6 y 10 caracteres");

        if (personaDTO.getPassword()==null)
            throw new RuntimeException("Password no puede ser nulo");

        if (personaDTO.getName()==null)
            throw new RuntimeException("Name no puede ser nulo");

        if (personaDTO.getPersonal_email()==null)
            throw new RuntimeException("Personal_email no puede ser nulo");

        if (personaDTO.getCompany_email()==null)
            throw new RuntimeException("Company_email no puede ser nulo");

        if (personaDTO.getCity()==null)
            throw new RuntimeException("City no puede ser nulo");

        if (personaDTO.getActive()==null)
            throw new RuntimeException("Active no puede ser nulo");

        Persona persona = new Persona(personaDTO.getUsuario(),
                                      personaDTO.getPassword(),
                                      personaDTO.getName(),
                                      personaDTO.getSurname(),
                                      personaDTO.getPersonal_email(),
                                      personaDTO.getCompany_email(),
                                      personaDTO.getCity(),
                                      personaDTO.getActive(),
                                      personaDTO.getImagen_url());

        personaRepositorio.save(persona);

    }

    public Persona buscarPorId(int id_persona) throws Exception{
        return personaRepositorio.findById(id_persona).orElseThrow(() -> new Exception("Id no encontrado"));
    }


    public Persona findByUsuario(String usuario) {
        return personaRepositorio.findByUsuario(usuario);
    }

    public List<Persona> devolverPersonas(){
        return personaRepositorio.findAll();
    }
}

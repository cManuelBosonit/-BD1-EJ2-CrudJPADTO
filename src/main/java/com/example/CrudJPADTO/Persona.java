package com.example.CrudJPADTO;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
//@AllArgsConstructor
public class Persona implements Serializable {

    @Id
    @GeneratedValue
    int id_persona;

    @NotNull
    String usuario;
    @NotNull
    String password;
    @NotNull
    String name;
    @NotNull
    String surname;
    @NotNull
    String company_email;
    @NotNull
    String personal_email;
    @NotNull
    String city;
    @NotNull
    Boolean active;
    @NotNull
    LocalDateTime created_date;
    String imagen_url;
    LocalDateTime termination_date;

    public Persona(){

        this.created_date = LocalDateTime.now();

    }

    public Persona(String _usuario,
                   String _password,
                   String _name,
                   String _surname,
                   String _company_email,
                   String _personal_email,
                   String _city,
                   Boolean _active,
                   String _imagen_url){

        this.usuario=_usuario;
        this.password=_password;
        this.name=_name;
        this.surname=_surname;
        this.company_email=_company_email;
        this.personal_email=_personal_email;
        this.city=_city;
        this.active=_active;
        this.imagen_url=_imagen_url;
        this.created_date = LocalDateTime.now();
        this.termination_date=null;

    }

}

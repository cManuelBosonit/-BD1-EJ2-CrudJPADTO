package com.example.CrudJPADTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonaDTO {

    String usuario;
    String password;
    String name;
    String surname;
    String personal_email;
    String company_email;
    String city;
    Boolean active;
    LocalDateTime createdDate;
    String imagen_url;
    LocalDateTime terminationDate;
}

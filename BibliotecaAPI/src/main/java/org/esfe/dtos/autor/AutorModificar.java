package org.esfe.dtos.autor;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class AutorModificar implements Serializable {
    private Integer id;
    private String nombre;
    private String nacionalidad;
}

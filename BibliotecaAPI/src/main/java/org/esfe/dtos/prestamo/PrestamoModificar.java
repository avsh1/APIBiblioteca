package org.esfe.dtos.prestamo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;


@Getter
@Setter
public class PrestamoModificar implements Serializable {
    private Integer id;
    private String nombrelibro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private Integer libroId;
}

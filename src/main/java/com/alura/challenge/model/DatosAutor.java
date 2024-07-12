package com.alura.challenge.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosAutor(
        @JsonAlias("name") String autor,
        @JsonAlias("birth_year") int nacimiento,
        @JsonAlias("death_year") int muerte
) {
}

package org.lafabrique_epita.application.dto.movie_post;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record GenreMovieDto(
        /*
        Request => idTmdb
        Response => idTmdb
         */
        Long id,

        @NotNull
        @NotBlank
        String name
) {}
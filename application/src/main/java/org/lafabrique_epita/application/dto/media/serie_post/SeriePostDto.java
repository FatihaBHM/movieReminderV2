package org.lafabrique_epita.application.dto.media.serie_post;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import org.lafabrique_epita.application.dto.media.GenreDto;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;


public record SeriePostDto(


        Long id,

        @JsonProperty("first_air_date")
        LocalDate firstAirDate,

        @JsonProperty("id_tmdb")
        @NotNull
        @PositiveOrZero
        Long idTmdb,

        String overview,

        @JsonProperty("poster_path")
        String posterPath,

        @JsonProperty("last_air_date")
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        LocalDate lastAirDate,

        String title,

        @PositiveOrZero
        @JsonProperty("number_of_episodes")
        int numberOfEpisodes,

        @PositiveOrZero
        @JsonProperty("number_of_seasons")
        int numberOfSeasons,

        float score,

        List<GenreDto> genres,

        List<SeasonPostDto> seasons
) {
}

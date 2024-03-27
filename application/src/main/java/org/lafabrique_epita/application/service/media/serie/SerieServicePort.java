package org.lafabrique_epita.application.service.media.serie;


import org.lafabrique_epita.application.dto.media.serie_get.SerieGetResponseDto;
import org.lafabrique_epita.domain.entities.SerieEntity;
import org.lafabrique_epita.domain.exceptions.SerieException;

import java.util.List;

public interface SerieServicePort {
    SerieEntity save(SerieEntity serie);
    List<SerieEntity> getAll();

    SerieGetResponseDto findSerieByIdTmdb(Long idTmdb) throws SerieException;
}

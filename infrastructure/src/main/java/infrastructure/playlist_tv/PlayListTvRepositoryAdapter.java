package infrastructure.playlist_tv;

import infrastructure.movie.MovieJPARepository;
import org.lafabrique_epita.domain.repositories.PlayListTvRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PlayListTvRepositoryAdapter implements PlayListTvRepository {

    private final MovieJPARepository movieJPARepository;

    public PlayListTvRepositoryAdapter(MovieJPARepository movieJPARepository) {
        this.movieJPARepository = movieJPARepository;
    }

}

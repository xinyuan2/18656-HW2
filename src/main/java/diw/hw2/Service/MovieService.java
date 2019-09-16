package diw.hw2.Service;

import diw.hw2.Model.Movie;
import diw.hw2.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @Auther xinyuan
 * @Date 2019-09-15 19:31
 **/
@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public Collection<Movie> getAllMoviesDirectedBy(String name){
        return movieRepository.getAllMoviesDirectedBy(name);
    }
}

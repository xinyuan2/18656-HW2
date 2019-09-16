package diw.hw2.Repository;

import diw.hw2.Model.Movie;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * @Auther xinyuan
 * @Date 2019-09-15 21:51
 **/
@Repository
public interface MovieRepository extends Neo4jRepository<Movie, Long> {
    @Query("match (movie:Movie)<-[:DIRECTED]-(p:Person {name:{0}}) return movie")
    Collection<Movie> getAllMoviesDirectedBy(String name);
}

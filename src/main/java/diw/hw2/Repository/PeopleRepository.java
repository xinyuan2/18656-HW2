package diw.hw2.Repository;

import diw.hw2.Model.Person;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * @Auther xinyuan
 * @Date 2019-09-15 19:35
 **/
@Repository
public interface PeopleRepository extends Neo4jRepository <Person, Long> {
    @Query("match (movie:Movie {title:{0}})<-[:ACTED_IN]-(p:Person) return p")
    Collection<Person> getAllPeopleWhoActMovie(String movieName);
}

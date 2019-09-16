package diw.hw2.Model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

/**
 * @Auther xinyuan
 * @Date 2019-09-15 19:05
 **/
@NodeEntity
public class Person {
    @GraphId
    private Long id;
    private int bornIn;
    private String name;
    @Relationship(type = "ACTED_IN", direction = Relationship.OUTGOING)
    private List<Movie> actedMovies;

    @Relationship(type = "DIRECTED", direction = Relationship.OUTGOING)
    private List<Movie> directedMovies;

    public List<Movie> getDirectedMovies() {
        return directedMovies;
    }

    public void setDirectedMovies(List<Movie> directedMovies) {
        this.directedMovies = directedMovies;
    }

    public List<Movie> getActedMovies() {
        return actedMovies;
    }

    public void setActedMovies(List<Movie> actedMovies) {
        this.actedMovies = actedMovies;
    }

    public Person() {
    }

    public int getBornIn() {
        return bornIn;
    }

    public void setBornIn(int bornIn) {
        this.bornIn = bornIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}

package diw.hw2.Model;
//import org.neo4j.ogm.annotation;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * @Auther xinyuan
 * @Date 2019-09-15 19:05
 **/
@NodeEntity
public class Movie {

    @GraphId
    private Long id;
    private String title;
    private int release;
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public Movie() {
    }
}

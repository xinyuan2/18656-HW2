package diw.hw2.Controller;

import diw.hw2.Model.Movie;
import diw.hw2.Model.Person;
import diw.hw2.Service.MovieService;
import diw.hw2.Service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @Auther xinyuan
 * @Date 2019-09-15 17:33
 **/


@Controller
@ResponseBody
public class RestController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {

        return "hello";
    }

    @Autowired
    MovieService movieService;

    @Autowired
    PeopleService peopleService;

    @RequestMapping(value = "/movie", method = RequestMethod.GET)
    public String getAllPeopleWhoActIn(String movie){
        Collection<Person> people = peopleService.getAllPeopleWhoActMovie(movie);
        StringBuilder result = new StringBuilder();
        for(Person p: people){
            result.append(p.getName());
            result.append(',');
        }
        if(result.length()>0){
            result.deleteCharAt(result.length()-1);
        }
        return result.toString();
    }

    @RequestMapping(value = "/director", method = RequestMethod.GET)
    public String getAllMoviesDirectedBy(String name){
        Collection<Movie> movies = movieService.getAllMoviesDirectedBy(name);
        StringBuilder result = new StringBuilder();
        for(Movie m: movies){
            result.append(m.getTitle());
            result.append(',');
        }
        if(result.length()>0){
            result.deleteCharAt(result.length()-1);
        }
        return result.toString();
    }

}

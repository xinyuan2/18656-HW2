package diw.hw2.Service;

import diw.hw2.Model.Person;
import diw.hw2.Repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @Auther xinyuan
 * @Date 2019-09-15 19:39
 **/
@Service
public class PeopleService {
    @Autowired
    PeopleRepository peopleRepository;


    public Collection<Person> getAllPeopleWhoActMovie(String movieName){
        return peopleRepository.getAllPeopleWhoActMovie(movieName);
    }
}

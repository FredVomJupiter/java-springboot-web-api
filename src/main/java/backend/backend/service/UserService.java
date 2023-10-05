package backend.backend.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import backend.backend.api.model.User;

@Service
public class UserService {

    private List<User> userList;


    public UserService() {
        userList = new ArrayList<>();

        User user = new User(1, "John", 30, "jonny@mail.de");
        User user2 = new User(2, "Jane", 25, "jane@mail.com");
        User user3 = new User(3, "Max", 35, "maximum@mail.nl");
        User user4 = new User(4, "Mia", 20, "mia@kl.nl");
        User user5 = new User(5, "Tom", 40, "tommy@tonline.de");

        userList.addAll(Arrays.asList(user, user2, user3, user4, user5));


    }


    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user: userList) {
            if(id == user.getId()) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }

    
    
}

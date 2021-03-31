package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoImp implements UserDao{
    private static int USER_COUNT;
    private final List<User> users;

    {
        users = new ArrayList<>();

        users.add(new User(++USER_COUNT,"Jessy", "PinkMan"));
        users.add(new User(++USER_COUNT,"Frank", "Gallagher"));
        users.add(new User(++USER_COUNT,"Fiona", "Gallagher"));
        users.add(new User(++USER_COUNT,"Mickey", "Milkovich"));
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User getById(int id) {//show
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }

    @Override
    public void add(User user) {
        user.setId(++USER_COUNT);
        users.add(user);
    }

    @Override
    public void delete(User user) {
    }

    @Override
    public void edit(int id) {
        //return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

}

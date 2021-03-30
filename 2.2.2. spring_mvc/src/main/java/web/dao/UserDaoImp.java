package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class UserDaoImp implements UserDao{
    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static final Map<Integer, User> users = new HashMap<>();

    static {
        User user = new User();
        user.setId(AUTO_ID.getAndIncrement());
        user.setName("Ian");
        user.setSurName("Gallagher");
        users.put((int) user.getId(), user);
        //------------------------------------
        User user1 = new User();
        user1.setId(AUTO_ID.getAndIncrement());
        user1.setName("Mickey");
        user1.setSurName("Milkovich");
        users.put((int) user1.getId(), user1);
        //--------------------------------------
        User user2 = new User();
        user2.setId(AUTO_ID.getAndIncrement());
        user2.setName("Mandy");
        user2.setSurName("Milkovich");
        users.put((int) user2.getId(), user2);
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    @Override
    public void add(User user) {
        user.setId(AUTO_ID.getAndIncrement());
        users.put((int) user.getId(), user);
    }

    @Override
    public void delete(User user) {
        users.remove(user.getId());
    }

    @Override
    public void edit(User user) {
        users.put((int) user.getId(), user);
    }

    @Override
    public User getById(Integer id) {
        return users.get(id);
    }
}

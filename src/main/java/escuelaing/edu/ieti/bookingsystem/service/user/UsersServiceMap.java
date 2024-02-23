package escuelaing.edu.ieti.bookingsystem.service.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import escuelaing.edu.ieti.bookingsystem.exception.UserNotFoundException;
import escuelaing.edu.ieti.bookingsystem.repository.user.User;

public class UsersServiceMap implements UsersService {

    Map<String, User> users = new HashMap<>();

    @Override
    public User save(User user) {
        users.put(user.getId(), user);
        return user;
    }

    @Override
    public Optional<User> findById(String id) {
        if (users.containsKey(id)) {
            return Optional.of(users.get(id));
        } else {
            throw new UserNotFoundException(id);
        }
    }

    @Override
    public List<User> all() {
        List<User> usersList = new ArrayList<>();
        usersList.addAll(users.values());
        return usersList;
    }

    @Override
    public void deleteById(String id) {
        if (!users.containsKey(id))
            throw new UserNotFoundException(id);
        users.remove(id);
    }

    @Override
    public User update(User user, String userId) {
        if (!users.containsKey(userId))
            throw new UserNotFoundException(userId);
        users.put(userId, user);
        return user;
    }
}

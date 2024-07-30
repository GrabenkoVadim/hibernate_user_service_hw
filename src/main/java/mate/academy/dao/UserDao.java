package mate.academy.dao;

import mate.academy.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    User addUser(User user);

    Optional<User> findByEmail(String email);
}

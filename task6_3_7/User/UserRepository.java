package task6_3_7.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(int id);
    User save(User user);
    boolean existsById(int id);
    void deleteById(int id);
}

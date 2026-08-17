package task6_3_7.Services;

import task6_3_7.User.User;
import task6_3_7.User.UserRepository;
import task6_3_7.Exceptions.UserNotFoundException;

public class UserService {
    private final UserRepository userRepository;
    private final EmailService emailService;

    public UserService(UserRepository userRepository, EmailService emailService) {
        this.userRepository = userRepository;
        this.emailService = emailService;
    }

    public User getUser(int id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found by id: " + id));
    }

    public User createUser(String name, String email) {
        User newUser = new User(0, name, email);
        User savedUser = userRepository.save(newUser);
        emailService.sendWelcomeEmail(savedUser.getEmail(), savedUser.getName());
        return savedUser;
    }

    public void deleteUser(int id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
        }
    }
}

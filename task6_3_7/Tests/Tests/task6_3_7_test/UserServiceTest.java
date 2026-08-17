package task6_3_7_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import task6_3_7.Exceptions.UserNotFoundException;
import task6_3_7.Services.EmailService;
import task6_3_7.Services.UserService;
import task6_3_7.User.User;
import task6_3_7.User.UserRepository;

import java.util.Optional;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private EmailService emailService;

    @InjectMocks
    private UserService userService;

    @Captor
    private ArgumentCaptor<User> userArgumentCaptor;

    @Test
    void getUser_Positive() {
        User expectedUser = new User(1, "Ivan", "ivan@Test.com");
        when(userRepository.findById(1)).thenReturn(Optional.of(expectedUser));

        User actualUser = userService.getUser(1);

        Assertions.assertEquals("Ivan", actualUser.getName());
        Assertions.assertEquals("ivan@Test.com", actualUser.getEmail());
    }

    @Test
    void getUser_Negative_ThrowsException() {
        when(userRepository.findById(99)).thenReturn(Optional.empty());

        Assertions.assertThrows(UserNotFoundException.class, () -> {
            userService.getUser(99);
        });
    }

    @Test
    void createUser_Positive_SendsEmailAndSaves() {
        User savedUser = new User(10, "Petr", "petr@Test.com");
        when(userRepository.save(any(User.class))).thenReturn(savedUser);

        User result = userService.createUser("Petr", "petr@Test.com");

        Assertions.assertEquals(10, result.getId());

        verify(emailService).sendWelcomeEmail("petr@Test.com", "Petr");
    }

    @Test
    void createUser_ArgumentCaptor() {
        User savedUser = new User(10, "Petr", "petr@Test.com");
        when(userRepository.save(any(User.class))).thenReturn(savedUser);

        userService.createUser("Petr", "petr@Test.com");

        verify(userRepository).save(userArgumentCaptor.capture());
        User capturedUser = userArgumentCaptor.getValue();

        Assertions.assertEquals("Petr", capturedUser.getName());
        Assertions.assertEquals("petr@Test.com", capturedUser.getEmail());
    }

    @Test
    void deleteUser_Positive_User_Exists() {
        when(userRepository.existsById(1)).thenReturn(true);

        userService.deleteUser(1);

        verify(userRepository, times(1)).deleteById(1);
    }

    @Test
    void deleteUser_Negative_User_NotExists() {
        when(userRepository.existsById(99)).thenReturn(false);

        userService.deleteUser(99);

        verify(userRepository, never()).deleteById(99);
    }
}

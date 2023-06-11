import org.example.User;
import org.example.UserDao;
import org.example.UserService;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserDao dao;
    @InjectMocks
    private UserService userService;


        @Test
        public void checkIfUserExistTrue(){
            User user = new User("test", 2, "@mail.ru");
            when(dao.getUserByName("test")).thenReturn(user);
            boolean userExists = userService.checkUserExists(user);
            verify(dao, times(1)).getUserByName("test");
            assertTrue(userExists);
        }
    @Test
    public void checkIfUserExistFalse() {
        User user = new User("test", 2, "@mail.ru");
        when(dao.getUserByName("test")).thenReturn(null);
        boolean userExists = userService.checkUserExists(user);
        assertFalse(userExists);
    }



}





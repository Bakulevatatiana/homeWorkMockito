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
    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void checkIfUserExistTrue(){
        when(dao.getUserByName("Oleg")).thenReturn(new User("Oleg"));
        boolean userExists= UserService.checkUserExists(
                new User ("Oleg"));

        assertTrue(userExists);


    }

    @Test
    public void checkIfUserExistFalse(){
         when(dao.getUserByName("test")).thenReturn(null);
        boolean userExists= UserService.checkUserExists(
                new User ("test"));

        assertFalse(userExists);
    }



}





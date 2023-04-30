import net.bytebuddy.asm.Advice;
import org.example.UserDaoImpl;
import org.example.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

        @Mock
        private  UserDao dao;
        @InjectMocks
        private UserService userService;

        @Test
        public void checkIfUserExistTrue(){
           when(dao.getUserByName("test")).thenReturn(new User("test"));
           boolean userExists= UserService.checkUserExists(
                   new User ("test"));
           verify(dao,times(1,)).getUserByName("test");
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

}

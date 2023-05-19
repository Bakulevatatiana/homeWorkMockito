import org.example.User;
import org.example.UserDao;
import org.example.UserDaoImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserDaoTest {
    private final UserDao dao=new UserDaoImpl();

    @Test
    public void testUserByUserName(){
        User user = dao.getUserByName("Oleg");
        Assertions.assertNotNull(user);
        Assertions.assertEquals(user.getName(),"Oleg");


    }
    @Test
    public void testUserByNameIsNull(){
        Assertions.assertNull(dao.getUserByName("person"));
    }



}

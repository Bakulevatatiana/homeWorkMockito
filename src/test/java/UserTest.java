import org.example.User;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.spy;

public class UserTest {
    @Test
    public void testIfValidation(){
        User user= spy(User.class);
        String testEmail="test@test.ru";
        user.setEmail(testEmail);
    }
}

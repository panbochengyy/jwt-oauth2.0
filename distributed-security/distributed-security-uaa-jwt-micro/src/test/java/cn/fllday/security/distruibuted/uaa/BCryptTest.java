package cn.fllday.security.distruibuted.uaa;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BCryptTest {


    public static void main(String[] args) {
        String secret = BCrypt.hashpw("secret", BCrypt.gensalt());
        System.out.println(secret);
    }
}

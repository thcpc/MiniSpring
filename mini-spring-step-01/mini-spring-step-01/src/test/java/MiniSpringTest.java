import cn.mini.springframework.BeanDefinition;
import cn.mini.springframework.BeanFactory;
import org.junit.jupiter.api.Test;

public class MiniSpringTest {

    @Test
    public void test_beanFactory(){
        UserService userService = new UserService();
        BeanFactory factory = new BeanFactory();
        factory.registerBeanDefinition("user", new BeanDefinition(userService));
        final UserService user = (UserService) factory.getBean("user");
        user.queryUserInfo();

    }
}

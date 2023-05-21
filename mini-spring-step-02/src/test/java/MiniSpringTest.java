import cn.mini.springframework.beans.config.BeanDefinition;
import cn.mini.springframework.beans.factory.DefaultListableBeanFactory;
import org.junit.jupiter.api.Test;

public class MiniSpringTest {

    @Test
    public void testBeanFactory(){
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        beanFactory.registerBeanDefinition("UserService", new BeanDefinition(UserService.class));
        try {
            UserService userService = (UserService) beanFactory.getBean("UserService");
            System.out.println(userService);
            userService.query();
            UserService userService1 = (UserService) beanFactory.getBean("UserService");
            System.out.println(userService1);
            userService1.query();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}

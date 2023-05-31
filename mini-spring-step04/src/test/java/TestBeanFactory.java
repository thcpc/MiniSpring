import bean.UserDao;
import bean.UserService;
import cn.mini.springframework.beans.PropertyValue;
import cn.mini.springframework.beans.PropertyValues;
import cn.mini.springframework.beans.factory.config.BeanDefinition;
import cn.mini.springframework.beans.factory.config.BeanReference;
import cn.mini.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.jupiter.api.Test;

public class TestBeanFactory {

    @Test
    public void test_beanFactory() throws InstantiationException, IllegalAccessException {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("id","1001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));


        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("UserService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("UserService");
        userService.queryUserInfo();
    }

}

import bean.UserService;
import cn.mini.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.mini.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import cn.mini.springframework.context.support.ClassPathXmlApplicationContext;
import common.MyBeanFactoryPostProcessor;
import common.MyBeanPostProcessor;
import org.junit.jupiter.api.Test;

public class APiTest {
    @Test
    public void test_BeanFactoryPostProcessorAndBeanPostProcessor(){
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);

        reader.loadBeanDefinition("classpath:spring.xml");
        MyBeanFactoryPostProcessor beanFactoryPostProcessor = new MyBeanFactoryPostProcessor();
        beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);

        MyBeanPostProcessor beanPostProcessor = new MyBeanPostProcessor();
        beanFactory.addBeanPostProcessor(beanPostProcessor);

        UserService userService = beanFactory.getBean("userService", UserService.class);

        String result = userService.queryUserInfo();
        System.out.println("测试结果:" + result);
    }

    @Test
    public void test_xml(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:springWithProcessor.xml");
        UserService userService = applicationContext.getBean("userService",UserService.class);
        System.out.println(userService.queryUserInfo());
    }
}

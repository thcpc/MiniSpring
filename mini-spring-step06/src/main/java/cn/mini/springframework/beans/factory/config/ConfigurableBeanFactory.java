package cn.mini.springframework.beans.factory.config;

public interface ConfigurableBeanFactory {
    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}

package cn.mini.springframework.beans.factory.config;

import cn.mini.springframework.beans.factory.HierarchicalBeanFactory;

public interface ConfigurableBeanFactory extends SingletonBeanRegistry, HierarchicalBeanFactory {
    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}

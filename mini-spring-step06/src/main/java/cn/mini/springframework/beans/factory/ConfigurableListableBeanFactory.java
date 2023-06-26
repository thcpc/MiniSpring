package cn.mini.springframework.beans.factory;

import cn.mini.springframework.beans.BeansException;
import cn.mini.springframework.beans.factory.config.AutowireCapableBeanFactory;
import cn.mini.springframework.beans.factory.config.BeanDefinition;
import cn.mini.springframework.beans.factory.config.BeanPostProcessor;
import cn.mini.springframework.beans.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
    void preInstantiateSingletons() throws BeansException;
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}

package cn.mini.springframework.beans.factory;

import cn.mini.springframework.beans.config.BeanDefinition;

public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}

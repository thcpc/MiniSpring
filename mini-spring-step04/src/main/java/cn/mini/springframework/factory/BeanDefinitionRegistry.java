package cn.mini.springframework.factory;

import cn.mini.springframework.beans.config.BeanDefinition;

public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}

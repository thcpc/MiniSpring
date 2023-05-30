package cn.mini.springframework.beans.factory.support;

import cn.mini.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args);
}

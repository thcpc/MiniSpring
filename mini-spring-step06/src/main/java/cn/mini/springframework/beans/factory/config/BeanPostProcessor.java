package cn.mini.springframework.beans.factory.config;

import cn.mini.springframework.beans.BeansException;

public interface BeanPostProcessor {
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;

}

package cn.mini.springframework.beans.factory;

import cn.mini.springframework.beans.BeansException;

public interface BeanFactory {

    public Object getBean(String beanName) throws BeansException;

    public Object getBean(String beanName, Object ... args) throws BeansException;

    <T> T getBean(String name, Class<T> requireType) throws BeansException;
}

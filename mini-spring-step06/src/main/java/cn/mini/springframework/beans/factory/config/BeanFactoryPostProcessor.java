package cn.mini.springframework.beans.factory.config;

import cn.mini.springframework.beans.BeansException;
import cn.mini.springframework.beans.factory.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}

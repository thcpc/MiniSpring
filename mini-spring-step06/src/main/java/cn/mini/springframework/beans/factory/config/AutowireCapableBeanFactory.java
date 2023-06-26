package cn.mini.springframework.beans.factory.config;

import cn.mini.springframework.beans.BeansException;
import cn.mini.springframework.beans.factory.BeanFactory;

public interface AutowireCapableBeanFactory extends BeanFactory {
    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException;
    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;

}

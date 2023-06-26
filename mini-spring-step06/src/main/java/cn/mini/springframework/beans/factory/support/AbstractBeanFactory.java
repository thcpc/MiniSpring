package cn.mini.springframework.beans.factory.support;

import cn.mini.springframework.beans.BeansException;
import cn.mini.springframework.beans.factory.BeanFactory;
import cn.mini.springframework.beans.factory.config.BeanDefinition;

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName, Object ... args) throws BeansException {
          return doGetBean(beanName, args);
    }

    @Override
    public Object getBean(String beanName) throws BeansException {
        return doGetBean(beanName, null);
    }


    @Override
    public <T> T getBean(String name, Class<T> requireType) throws BeansException {
        return (T)getBean(name);
    }

    protected <T> T doGetBean(final String beanName, final Object[] args){
        Object bean = getSingleton(beanName);
        if( bean != null){
            return (T)bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return (T)createBean(beanName, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName);

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object ... args) throws BeansException;
}

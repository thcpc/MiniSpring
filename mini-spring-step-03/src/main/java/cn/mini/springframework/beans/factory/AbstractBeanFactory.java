package cn.mini.springframework.beans.factory;

import cn.mini.springframework.beans.BeanFactory;
import cn.mini.springframework.beans.config.BeanDefinition;

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) throws InstantiationException, IllegalAccessException {
        Object bean = getSingleton(beanName);
        if( bean != null){
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName);
    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws InstantiationException, IllegalAccessException;
}

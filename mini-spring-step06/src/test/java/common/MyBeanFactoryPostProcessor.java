package common;

import cn.mini.springframework.beans.BeansException;
import cn.mini.springframework.beans.PropertyValue;
import cn.mini.springframework.beans.PropertyValues;
import cn.mini.springframework.beans.factory.ConfigurableListableBeanFactory;
import cn.mini.springframework.beans.factory.config.BeanDefinition;
import cn.mini.springframework.beans.factory.config.BeanFactoryPostProcessor;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("company","change to yan"));
    }
}

package cn.mini.springframework.beans.factory.config;

import cn.mini.springframework.beans.PropertyValues;

public class BeanDefinition {
    private Class beanClass;

    private PropertyValues propertyValues;

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues !=null? propertyValues:new PropertyValues();

    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }

    public BeanDefinition(Class beanClass) {
        this(beanClass, null);
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}

package cn.mini.springframework.beans.factory.support;

import cn.mini.springframework.beans.BeansException;
import cn.mini.springframework.core.io.Resource;
import cn.mini.springframework.core.io.ResourceLoader;

public interface BeanDefinitionReader {
    BeanDefinitionRegistry getRegistry();
    ResourceLoader getResourceLoader();
    void loadBeanDefinition(Resource resource) throws BeansException;
    void loadBeanDefinition(Resource... resources) throws BeansException;
    void loadBeanDefinition(String location) throws BeansException;
}

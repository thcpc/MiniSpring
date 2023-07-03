package cn.mini.springframework.beans.factory.support;

import cn.mini.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import cn.mini.springframework.context.support.AbstractRefreshableApplicationContext;

public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if(null!=configLocations){
            beanDefinitionReader.loadBeanDefinition(configLocations);
        }

    }

    protected abstract String[] getConfigLocations();
}

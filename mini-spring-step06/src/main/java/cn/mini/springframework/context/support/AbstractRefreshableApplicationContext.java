package cn.mini.springframework.context.support;

import cn.mini.springframework.beans.BeansException;
import cn.mini.springframework.beans.factory.ConfigurableListableBeanFactory;
import cn.mini.springframework.beans.factory.support.DefaultListableBeanFactory;

public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext{
    private DefaultListableBeanFactory beanFactory;

    @Override
    public void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory1 = createBeanFactory();
        this.loadBeanDefinitions(beanFactory1);
        this.beanFactory = beanFactory1;

    }

    private DefaultListableBeanFactory createBeanFactory(){
        return new DefaultListableBeanFactory();
    }


    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    public ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }
}

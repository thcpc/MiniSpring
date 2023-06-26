package cn.mini.springframework.context;

import cn.mini.springframework.beans.BeansException;

public interface ConfigurableApplicationContext extends ApplicationContext{
    void refresh() throws BeansException;
}

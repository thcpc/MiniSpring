package cn.mini.springframework.beans.config;

public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}

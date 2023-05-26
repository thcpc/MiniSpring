package cn.mini.springframework.config;

public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}

package cn.mini.springframework.beans.factory;

public interface BeanFactory {

    public Object getBean(String beanName) throws InstantiationException, IllegalAccessException;

    public Object getBean(String beanName, Object ... args) throws InstantiationException, IllegalAccessException;
}

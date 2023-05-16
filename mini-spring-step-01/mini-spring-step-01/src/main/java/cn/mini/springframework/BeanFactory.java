package cn.mini.springframework;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition){
        this.beanDefinitionMap.put(name, beanDefinition);
    }

    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

}

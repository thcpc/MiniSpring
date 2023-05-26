package cn.mini.springframework.factory;

import cn.mini.springframework.beans.BeansException;
import cn.mini.springframework.beans.config.BeanDefinition;

import java.lang.reflect.Constructor;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();


    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object... args) throws BeansException {
        Object bean = null;
        try {
            bean = createBeanInstance(beanDefinition, beanName, args);
        }catch (Exception e) { throw new BeansException("Instantiation of bean failed", e);}
        addSingleton(beanName, bean);
        return bean;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition, String beanName, Object[] args){
      Constructor constructor = null;
      Class beanClass = beanDefinition.getBeanClass();
      Constructor[] declaredConstructors = beanClass.getDeclaredConstructors();
      for(Constructor ctor: declaredConstructors){
          if(null!=args && ctor.getParameterTypes().length == args.length){
              constructor = ctor;
              break;
          }
      }
      return instantiationStrategy.instantiate(beanDefinition, beanName, constructor, args);
  }
}

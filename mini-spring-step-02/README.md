# 实现Bean的定义，注册，获取
Bean的容器有如下行为:
1. 注册
2. 创建 Bean
3. 获取 Bean
4. 为了节省空间，对于相同的Bean采取单态模式

# 类和接口的代表的含义
### BeanDefinition
POJO类 </br>
定义 Bean 由哪些部分组成（目前阶段只有Class）
### BeanFactory
接口 </br> 
声明 获取 Bean 功能
### SingletonBeanRegistry
接口 </br> 
声明 单态功能(getSingleton)
### BeanDefinitionRegistry
接口 </br> 
声明 通过 "Bean的名字" "BeanDefinition" 注册Bean的功能
### DefaultSingletonBeanRegistry
实现类 </br>
实现了 SingletonBeanRegistry, 具体实现 Bean 单态模式

### AbstractBeanFactory
抽象类 </br>
继承了 BeanFactory </br>
使用 （**模版模式**） 定义 获取Bean的功能的流程 </br>
声明 创建Bean的功能

### AbstractAutowireCapableBeanFactory
抽象类 </br>
继承了 AbstractBeanFactory </br>
实现了 获取 Bean 的功能

### DefaultListableBeanFactory
实现类
继承 AbstractAutowireCapableBeanFactory
实现 BeanDefinitionRegistry 注册 Bean的功能

# 小结
DefaultListableBeanFactory 是最终实现的 Bean 容器，它实现了前面提到的一个BeanFactory 应该包含的功能 </br>
只是它是通过继承关系，一层一层实现。
1. 注册 </br>
BeanDefinitionRegistry <-- DefaultListableBeanFactory
2. 创建 Bean</br>
AbstractBeanFactory <-- AbstractAutowireCapableBeanFactory <-- DefaultListableBeanFactory
3. 获取 Bean</br>
BeanFactory <-- AbstractBeanFactory <-- AbstractAutowireCapableBeanFactory <-- DefaultListableBeanFactory 
4. 为了节省空间，对于相同的Bean采取单态模式 </br>
SingletonBeanRegistry <-- DefaultSingletonBeanRegistry <-- AbstractBeanFactory <-- AbstractAutowireCapableBeanFactory <-- DefaultListableBeanFactory
</br>
这种实现方式，把每一个步骤都解耦出来，可以根据需要快速的实现新的实现方式，只要一层一层推进即可
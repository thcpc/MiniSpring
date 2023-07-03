package cn.mini.springframework.context.support;

import cn.mini.springframework.beans.factory.support.AbstractXmlApplicationContext;

public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext{
    private String[] configLocation;

    public ClassPathXmlApplicationContext() {

    }

    public ClassPathXmlApplicationContext(String[] configLocation) {
        this.configLocation = configLocation;
        refresh();
    }

    public ClassPathXmlApplicationContext(String configLocations) {
        this(new String[]{configLocations});
    }

    @Override
    protected String[] getConfigLocations() {
        return this.configLocation;
    }
}

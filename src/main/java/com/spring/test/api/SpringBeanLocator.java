package com.spring.test.api;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * Created by hkw on 2017/4/11.
 */
public class SpringBeanLocator implements BeanFactoryAware {

    private static BeanFactory beanFactory ;
    private static SpringBeanLocator beanLocator = null;

    public static SpringBeanLocator getInstance() {
        if (null == beanLocator) {
            beanLocator = (SpringBeanLocator) beanFactory.getBean("springBeanLocator", SpringBeanLocator.class);
        }
        return beanLocator;
    }

    public <T>T getBean(String beanName, Class<T> targetClass) {
        return beanFactory.getBean(beanName,targetClass);
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
}

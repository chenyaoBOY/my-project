package org.spring.study.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.*;
import org.springframework.core.io.ResourceLoader;

/**
 * @author chenyao
 * @date 2020/5/7 14:19
 * @description
 */
public class IOCUser implements BeanNameAware,
        BeanFactoryAware,
        MessageSourceAware,
        ApplicationEventPublisherAware,
        ResourceLoaderAware,
        ApplicationContextAware {
    @Override
    public void setBeanName(String s) {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    public void setMessageSource(MessageSource messageSource) {

    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {

    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {

    }
}

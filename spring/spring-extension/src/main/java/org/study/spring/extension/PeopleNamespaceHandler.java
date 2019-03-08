package org.study.spring.extension;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author chenyao
 * @Description:
 * @date 2018/7/18/15:34
 */
public class PeopleNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {

        registerBeanDefinitionParser("people",new PeopleBeanDefinitionParser());

    }
}

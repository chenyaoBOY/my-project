package org.study.spring.extension;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @author chenyao
 * @Description:
 * @date 2018/7/18/15:35
 */
public class PeopleBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return People.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String id = element.getAttribute("id");
        String name = element.getAttribute("name");
        String age = element.getAttribute("age");

        builder.addPropertyValue("id",id);
        builder.addPropertyValue("name",name);
        builder.addPropertyValue("age",Integer.valueOf(age));

    }
}

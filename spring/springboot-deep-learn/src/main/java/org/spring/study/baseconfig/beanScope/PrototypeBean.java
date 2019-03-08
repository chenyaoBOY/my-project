package org.spring.study.baseconfig.beanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 多例bean
 */
@Component
@Scope("prototype")
public class PrototypeBean {
}

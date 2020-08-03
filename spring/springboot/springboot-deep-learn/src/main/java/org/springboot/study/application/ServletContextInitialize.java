package org.springboot.study.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * @author chenyao
 * @date 2020/7/23 14:36
 * @description
 */
@Component
public class ServletContextInitialize implements ServletContextInitializer {
    Logger log = LoggerFactory.getLogger(ServletContextInitialize.class);
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        log.info("servletContextPath:{},serverIno:{}，servletContextName:{}",servletContext.getContextPath(),
                servletContext.getServerInfo(),servletContext.getServletContextName());
    }
}

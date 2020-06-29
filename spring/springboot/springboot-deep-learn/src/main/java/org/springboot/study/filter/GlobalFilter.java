package org.springboot.study.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class GlobalFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter初始化");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("GlobalFilter过滤器开始工作");
        HttpServletResponse response = (HttpServletResponse)res;
        response.addHeader("Header-Global","made in GlobalFilter");
        chain.doFilter(req,res);
        System.out.println("GlobalFilter过滤器又来了");
    }

    @Override
    public void destroy() {
        System.out.println("过滤器挂了");
    }

    public static void main(String[] args) {
        Class<?>[] interfaces = GlobalFilter.class.getInterfaces();
        System.out.println();
    }
}

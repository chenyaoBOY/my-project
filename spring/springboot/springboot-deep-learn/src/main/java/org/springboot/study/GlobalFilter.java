package org.springboot.study;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GlobalFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter初始化");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("过滤器开始工作");
        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse)res;
        StringBuffer requestURL = request.getRequestURL();
        chain.doFilter(req,res);
        System.out.println("过滤器又来了");
    }

    @Override
    public void destroy() {
        System.out.println("过滤器挂了");
    }
}

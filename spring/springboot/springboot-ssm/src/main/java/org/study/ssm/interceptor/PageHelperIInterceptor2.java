package org.study.ssm.interceptor;

import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Properties;

/**
 * @author chenyao
 * @date 2020/6/23 18:30
 * @description
 */
@Intercepts(
        {
                @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}),
                @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class, CacheKey.class, BoundSql.class}),
        }
)
@Component
public class PageHelperIInterceptor2 implements Interceptor {
    @PostConstruct
    public void init(){
        System.out.println(PageHelperIInterceptor2.class+"初始化");
    }
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println(PageHelperIInterceptor2.class.getSimpleName()+"开始工作了");
        return invocation.getMethod().invoke(invocation.getTarget(),invocation.getArgs());
    }

    @Override
    public Object plugin(Object o) {
        if(o instanceof Executor){
            return Plugin.wrap(o,this);
        }
        return o;
    }

    @Override
    public void setProperties(Properties properties) {

    }
}

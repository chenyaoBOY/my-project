package org.study.dubbo.provider;

import com.alibaba.dubbo.rpc.RpcContext;
import org.study.dubbo.service.UserService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author chenyao
 * @Description:
 * @date 2018/7/17/17:46
 */
public class UserServiceImpl implements UserService {
    @Override
    public String getUserName(String userName) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + userName + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return userName;
    }
}

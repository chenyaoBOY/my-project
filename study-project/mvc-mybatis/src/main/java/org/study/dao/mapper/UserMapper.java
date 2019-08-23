package org.study.dao.mapper;

import org.apache.ibatis.annotations.Param;
import org.study.bean.UserBean;

import java.util.List;

/**
 * @author chenyao
 * @date 2019/7/11 14:12
 * @description
 */
public interface UserMapper {

    int updateUserById(UserBean bean);

    List<UserBean> getUserList();

    UserBean getUserBean(Integer id);
    UserBean getUserBean2(@Param("id") Integer id);
    UserBean getUserBean3(String preFixTableName);
    UserBean getUserBean4(@Param("table") String preFixTableName);

    List<String> getOrderSnByUserId(Integer userId);
    List<String> getOrderSn(Integer userId);
    int update4Concurrent(UserBean userBean);
}

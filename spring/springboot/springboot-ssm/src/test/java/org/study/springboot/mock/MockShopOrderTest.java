package org.study.springboot.mock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.study.springboot.SpringbootTestBase;
import org.study.ssm.mapper.ShopOrderMapper;
import org.study.ssm.service.ShopOrderService;

import java.util.List;

import static org.mockito.Mockito.*;

/**
 * @author chenyao
 * @date 2020/5/27 15:49
 * @description
 */
public class MockShopOrderTest {


    @Test
    public void test(){
        List<String> list = mock(List.class);
        when(list.get(0)).thenReturn("hello");
        when(list.get(1)).thenThrow(new RuntimeException("异常"));

        System.out.println(list.get(0));
        verify(list).get(0);
        System.out.println(list.get(1));
    }

}

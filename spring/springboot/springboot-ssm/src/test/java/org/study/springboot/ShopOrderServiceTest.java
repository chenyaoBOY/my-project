package org.study.springboot;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.study.ssm.SpringbootSSM;
import org.study.ssm.domain.ShopOrder;
import org.study.ssm.mapper.ShopOrderMapper;
import org.study.ssm.service.ShopOrderService;

import java.util.Arrays;

/**
 * @author chenyao
 * @date 2020/5/27 15:40
 * @description
 */
public class ShopOrderServiceTest extends SpringbootTestBase{


    @Autowired
    private ShopOrderService shopOrderService;
    @Autowired
    private ShopOrderMapper shopOrderMapper;

    @Test
    public void test(){
        int count = shopOrderService.count();
        Assert.assertEquals(count,2);
    }
    @Test
    public void test2(){
        ShopOrder order = new ShopOrder();
        order.setId(110);
        shopOrderMapper.batchInsert(Arrays.asList(new ShopOrder(),new ShopOrder()));
    }



}

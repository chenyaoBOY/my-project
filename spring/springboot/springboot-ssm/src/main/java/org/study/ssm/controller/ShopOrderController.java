package org.study.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.interceptor.DefaultTransactionAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.study.ssm.domain.ShopOrder;
import org.study.ssm.mapper.ShopOrderMapper;

/**
 * @author chenyao
 * @date 2020/5/26 14:39
 * @description
 */
@RestController
public class ShopOrderController {

    @Autowired
    private ShopOrderMapper shopOrderMapper;
    @Autowired
    private DataSourceTransactionManager dataSourceTransactionManager;

    /***
     * @description //TODO 验证声明式事务是否有效 结果：可以这么使用
     * @author chenyao
     * @date 2020/5/26 14:57
     * @param
     * @return int
     */
    @GetMapping("/hand/transaction")
    public int handTransaction(@RequestParam int open) {
        DefaultTransactionAttribute des = new DefaultTransactionAttribute();
        des.setName("123");
        des.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        TransactionStatus transaction = dataSourceTransactionManager.getTransaction(des);
        try {
            ShopOrder shopOrder = new ShopOrder();
            shopOrder.setId(1);
            shopOrder.setOrderStatus(new Byte("1"));
            int i = shopOrderMapper.updateByPrimaryKey(shopOrder);
            if (open == 0) {
                int j = 1 / 0;
            }
            dataSourceTransactionManager.commit(transaction);
            return i;
        } catch (Exception e) {
            dataSourceTransactionManager.rollback(transaction);
            return 0;
        }

    }
}

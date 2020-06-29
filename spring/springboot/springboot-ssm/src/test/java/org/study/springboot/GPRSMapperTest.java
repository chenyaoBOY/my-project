package org.study.springboot;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.study.ssm.domain.GprsReconciliationChannelBill;
import org.study.ssm.mapper.GPRSMapper;

/**
 * @author chenyao
 * @date 2020/6/17 10:43
 * @description
 */
public class GPRSMapperTest extends SpringbootTestBase {

    @Autowired
    private GPRSMapper gprsMapper;

    @Test
    public void test() throws IllegalAccessException {
        TransferObject service =  new TransferObject();
        GprsReconciliationChannelBill bill = new GprsReconciliationChannelBill();
        GprsReconciliationChannelBill transfer = service.transfer(bill);
        System.out.println(gprsMapper.insert(transfer));
    }


}

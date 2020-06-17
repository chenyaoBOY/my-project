package org.study.ssm.mapper;

import org.springframework.stereotype.Repository;
import org.study.ssm.domain.GprsReconciliationChannelBill;

import java.util.List;

/**
 * @author chenyao
 * @date 2020/6/17 10:42
 * @description
 */
@Repository
public interface GPRSMapper {
    int count();
    int insert(GprsReconciliationChannelBill bill);
    int batchInsert(List<GprsReconciliationChannelBill> list);
}

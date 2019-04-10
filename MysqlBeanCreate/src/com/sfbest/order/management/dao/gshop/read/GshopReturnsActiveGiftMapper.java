package com.sfbest.order.management.dao.gshop.read;

import com.sfbest.order.management.vo.GshopReturnsActiveGift;
import com.sfbest.order.management.vo.GshopReturnsActiveGiftExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GshopReturnsActiveGiftMapper {
    int countByExample(GshopReturnsActiveGiftExample example);

    int deleteByExample(GshopReturnsActiveGiftExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GshopReturnsActiveGift record);

    int insertSelective(GshopReturnsActiveGift record);

    List<GshopReturnsActiveGift> selectByExample(GshopReturnsActiveGiftExample example);

    GshopReturnsActiveGift selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GshopReturnsActiveGift record, @Param("example") GshopReturnsActiveGiftExample example);

    int updateByExample(@Param("record") GshopReturnsActiveGift record, @Param("example") GshopReturnsActiveGiftExample example);

    int updateByPrimaryKeySelective(GshopReturnsActiveGift record);

    int updateByPrimaryKey(GshopReturnsActiveGift record);
}
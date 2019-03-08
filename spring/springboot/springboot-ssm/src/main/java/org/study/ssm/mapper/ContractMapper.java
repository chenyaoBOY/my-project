package org.study.ssm.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.study.ssm.bean.Contract;

import java.util.List;

@Mapper
@Repository
public interface ContractMapper {

    List<Contract> listContract();
    Contract getContract();
}

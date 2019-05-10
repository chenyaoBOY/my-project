package org.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.study.dao.mapper.IndexMapper;

/**
 * @author chenyao
 * @date 2019/5/9 17:29
 * @description
 */

@Service
public class TransactionService {

    @Autowired
    private IndexMapper indexMapper;

    public void ifAbleRepeatReadInOneTransaction(){
        Integer id = indexMapper.getId(8);
        System.out.println("更新前id="+id);
        indexMapper.updateId();
        Integer id2 = indexMapper.getId(8);
        System.out.println("更新后id="+id2);

    }
}

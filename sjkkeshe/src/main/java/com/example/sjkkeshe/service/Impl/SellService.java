package com.example.sjkkeshe.service.Impl;

import com.example.sjkkeshe.entity.Sell;
import com.example.sjkkeshe.mapper.SellMapper;
import com.example.sjkkeshe.service.ISellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SellService implements ISellService {

    @Autowired
    private SellMapper sellMapper;

    @Override
    public void insertSellRecord(Sell sell) {
        // 这里实现插入 sell 记录的逻辑
        sellMapper.insertSellRecord(sell);
    }

    @Override
    @Transactional
    public void insertSellRecordAndUpdateBalance(Sell sell) {
        // 插入sell记录
        sellMapper.insertSellRecord(sell);

        // 更新用户余额
        sellMapper.updateUserBalance(sell);

        sellMapper.updateStoreGoodsNum(sell);


    }
}

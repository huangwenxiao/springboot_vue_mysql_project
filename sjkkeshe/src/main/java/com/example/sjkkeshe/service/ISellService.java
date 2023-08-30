package com.example.sjkkeshe.service;

import com.example.sjkkeshe.entity.Sell;
import org.springframework.transaction.annotation.Transactional;

public interface ISellService {
    void insertSellRecord(Sell sell);

    @Transactional
    void insertSellRecordAndUpdateBalance(Sell sell);
}

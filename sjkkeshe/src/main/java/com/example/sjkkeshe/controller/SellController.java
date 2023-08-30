package com.example.sjkkeshe.controller;

import com.example.sjkkeshe.common.Result;
import com.example.sjkkeshe.entity.Sell;
import com.example.sjkkeshe.service.ISellService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/sell")
public class SellController {
    private static final Logger logger = LoggerFactory.getLogger(SellController.class);

    @Autowired
    private ISellService sellService;

    @PostMapping("/add")
    public Result insertSellRecord(@RequestBody Sell sell) {
        try {
            logger.info("Received request to insert sell record: {}", sell);

            // 调用新的方法插入sell记录并更新余额
            sellService.insertSellRecordAndUpdateBalance(sell);

            logger.info("Sell record inserted successfully: {}", sell);
            return Result.success();
        } catch (Exception e) {
            logger.error("Error inserting sell record: {}", e.getMessage(), e);
            return Result.error("Error inserting sell record");
        }
    }
}

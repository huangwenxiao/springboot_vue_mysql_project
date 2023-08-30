package com.example.sjkkeshe.mapper;

import com.example.sjkkeshe.entity.Sell;
import org.apache.ibatis.annotations.*;

@Mapper
public interface SellMapper {
    @Insert("INSERT INTO sell (user_name, goods_name, sell_num, sell_value) " +
            "VALUES (#{user_name}, #{goods_name}, #{sell_num}, #{sell_value})")
    @Options(useGeneratedKeys = true, keyProperty = "sell_id", keyColumn = "sell_id")
    void insertSellRecord(Sell sell);

    @Update("UPDATE user SET user_yue = user_yue - #{sell_value} WHERE user_name = #{user_name}")
    void updateUserBalance(Sell sell);

    @Update("UPDATE store SET store_num = store_num - #{sell_num} WHERE store_name = #{goods_name}")
    int updateStoreGoodsNum(Sell sell);




}

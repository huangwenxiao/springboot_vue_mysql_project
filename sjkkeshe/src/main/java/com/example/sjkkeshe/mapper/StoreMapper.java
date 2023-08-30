package com.example.sjkkeshe.mapper;

import com.example.sjkkeshe.entity.Store;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface StoreMapper {
    @Select("SELECT * FROM store")
    List<Store> listStore();

    @Delete("DELETE FROM store WHERE store_id = #{store_id}")
    void deleteStore(Integer store_id);

    @Update("UPDATE store SET store_num = store_num+#{storeNum} WHERE store_id = #{storeId}")
    void updateStoreNum(@Param("storeId") Integer storeId, @Param("storeNum") Integer storeNum);

}

package com.example.sjkkeshe.service;

import com.example.sjkkeshe.entity.Store;

import java.util.List;

//业务处理层，用于操作数据库
public interface IStoreService {
    List<Store> ListStore();

    List<Store> listStore();

    void deleteStore(Integer store_id);

    void updateStoreNum(Integer storeId, Integer storeNum);

}

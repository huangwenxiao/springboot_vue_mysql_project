package com.example.sjkkeshe.service.Impl;

import com.example.sjkkeshe.entity.Store;
import com.example.sjkkeshe.mapper.StoreMapper;
import com.example.sjkkeshe.service.IStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StoreService implements IStoreService {

    @Autowired
    private StoreMapper storeMapper;

    @Override
    public List<Store> ListStore() {
        return null;
    }

    @Override
    public List<Store> listStore() {
        return storeMapper.listStore();
    }

    @Override
    public void deleteStore(Integer store_id) {
        storeMapper.deleteStore(store_id);
    }
    @Override
    public void updateStoreNum(Integer storeId, Integer storeNum) {
        storeMapper.updateStoreNum(storeId, storeNum);
    }
}

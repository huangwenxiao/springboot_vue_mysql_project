package com.example.sjkkeshe.controller;

import com.example.sjkkeshe.common.Result; // 导入 Result 类

// 其他导入语句
import com.example.sjkkeshe.entity.Store;
import com.example.sjkkeshe.service.IStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RequestMapping("/store")
@RestController
public class StoreController {
    @Autowired
    private IStoreService storeService;

    @GetMapping("/list")
    public List<Store> listStore() {
        return storeService.listStore();
    }

    @DeleteMapping("/delete/{id}")
    public Result deleteStore(@PathVariable Integer id) {
        storeService.deleteStore(id);
        return Result.success();
    }
    @PutMapping("/updateNum/{id}")
    public Result updateStoreNum(@PathVariable Integer id, @RequestBody Map<String, Integer> payload) {
        Integer newStoreNum = payload.get("newStoreNum");
        storeService.updateStoreNum(id, newStoreNum);
        return Result.success();
    }

}

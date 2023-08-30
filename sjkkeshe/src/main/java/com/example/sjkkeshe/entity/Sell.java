package com.example.sjkkeshe.entity;

public class Sell {
    private Long sell_id; // 添加了 sell_id 字段
    private String user_name;
    private Integer sell_num;
    private String goods_name;
    private Integer sell_value;

    public Long getSell_id() {
        return sell_id;
    }

    public void setSell_id(Long sell_id) {
        this.sell_id = sell_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Integer getSell_num() {
        return sell_num;
    }

    public void setSell_num(Integer sell_num) {
        this.sell_num = sell_num;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public Integer getSell_value() {
        return sell_value;
    }

    public void setSell_value(Integer sell_value) {
        this.sell_value = sell_value;
    }
}

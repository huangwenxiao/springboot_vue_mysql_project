package com.example.sjkkeshe.controller.request;

import lombok.Data;

@Data
public class UserPageRequest {
    private Integer pageNum=1;
    private Integer pageSize=15;
    private String user_name;
    private String user_call;
}

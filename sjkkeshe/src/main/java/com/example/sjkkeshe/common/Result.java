package com.example.sjkkeshe.common;
//这是为了写一个类用于包装返回给前端的信息
import lombok.Data;

//包装后台数据
@Data
public class Result {
    private static final String SUCCESS_CODE = "200";
    private static final String ERROR_CODE = "-1";

    private String code;
    private Object data;  //前端从这里获取信息
    private String msg;


    //返回成功的信息
    public static  Result success(){
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        return result;
    }
    public static Result success(Object data){
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        result.setData(data);
        return result;
    }
    public static   Result error(String msg){
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        result.setMsg(msg);
        return result;
    }
}


package com.muzg.cgis.util;

import java.util.Date;

public class CommonResult<T> {
    private long code;
    private String message;
    private T data;
    private long time;

    public CommonResult(long code,String message,T data,long time){
        this.code = code;
        this.message = message;
        this.data = data;
        this.time = time;
    }

    public CommonResult() {
    }

    /**
     *  成功有返回数据
     */
    public static <T>CommonResult<T> success(T data){
        return new CommonResult<>(ResultCode.SUCCESS_CODE,ResultCode.SUCCESS_MESSAGE,data,new Date().getTime());
    }

    /**
     * 成功无返回数据
     * @param
     * @return
     */
    public static <T>CommonResult<T> success(){
        return new CommonResult<>(ResultCode.SUCCESS_CODE,ResultCode.SUCCESS_MESSAGE,null,new Date().getTime());
    }

    /**
     * 失败
     * @param <T>
     * @return
     */
    public static <T>CommonResult<T> failed(){
        return new CommonResult<>(ResultCode.FAILED_CODE,ResultCode.FAILED_MESSAGE,null,new Date().getTime());
    }

    public long getCode() { return code; }

    public void setCode(long code) { this.code = code; }

    public String getMessage() { return message; }

    public void setMessage(String message) { this.message = message; }

    public T getData() { return data; }

    public void setData(T data) { this.data = data; }

    public long getTime() { return time; }

    public void setTime(long time) { this.time = time;
    }
}

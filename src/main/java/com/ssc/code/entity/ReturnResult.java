package com.ssc.code.entity;

public class ReturnResult<T> {

    private String msg;

    /**
     * 0-success, 1-failure
     */
    private String tag;

    private T data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

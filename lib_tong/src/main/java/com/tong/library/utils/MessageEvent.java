package com.tong.library.utils;

public class MessageEvent {

    private String msg;
    private String date;

    public MessageEvent(String msg) {
        this.msg = msg;
    }

    public MessageEvent(String msg, String date) {
        this.msg = msg;
        this.date = date;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

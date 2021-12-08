package com.matchartist.backend.config.handlers;

public class ExceptionDetails {
    private String msg;
    private int status;

    public ExceptionDetails(){

    }

    public ExceptionDetails(String msg, int status) {
        this.msg = msg;
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

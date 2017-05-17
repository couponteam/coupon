/**
 * Copyright (c) 2015, 59store. All rights reserved.
 */
package com.masou.coupon.common.exception;

/**
 * Created by paul on 16/12/21.
 */
public class BaseException extends RuntimeException {

    private int status;

    public BaseException() {
        this(-1);
    }

    public BaseException(int status) {
        this(status, null);
    }

    public BaseException(int status, String message) {
        super(message);
        this.status = status;
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(int status, String message, Throwable cause) {
        super(message, cause);
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return getMessage();
    }

}

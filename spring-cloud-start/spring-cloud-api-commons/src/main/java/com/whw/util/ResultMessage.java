package com.whw.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultMessage<T> {
    private String status;
    private String msg;
    private T result;

    public ResultMessage(String status, String msg) {
        this.status = status;
        this.msg = msg;
    }
}
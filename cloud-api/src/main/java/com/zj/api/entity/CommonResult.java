package com.zj.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer Code;
    private String MSG;
    private T Data;

    public CommonResult(Integer code, String MSG) {
        Code = code;
        this.MSG = MSG;
    }
}

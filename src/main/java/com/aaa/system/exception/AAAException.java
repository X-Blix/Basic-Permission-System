package com.aaa.system.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 自定义全局异常类
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AAAException extends RuntimeException {
    private Integer code;
    private String msg;
}

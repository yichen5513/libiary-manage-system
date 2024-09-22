package com.ycproject.bookmanage.common.exception;/*
 * @author      :  YC
 * @date        :  2024/8/25 16:49
 * @description :  some description
 */

import com.ycproject.bookmanage.common.ResultCodeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CustomDefineException extends RuntimeException {

    private static final long serialVersionUID = -8436724655598762422L;
    private Integer code;

    private String message;

    /**
     * 通过状态码和错误消息创建异常对象
     *
     * @param code
     * @param message
     */
    public CustomDefineException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    /**
     * 接收枚举类型对象
     *
     * @param resultCodeEnum
     */
    public CustomDefineException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
        this.message = resultCodeEnum.getMessage();
    }

    public CustomDefineException(ResultCodeEnum resultCodeEnum, String msg) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
        this.message = String.format(resultCodeEnum.getMessage(), msg);
    }


}

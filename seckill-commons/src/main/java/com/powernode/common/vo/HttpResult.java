package com.powernode.common.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author wangjunchen
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HttpResult implements Serializable {
    /**
     * 响应码
     */
    private Integer code;
    /**
     * 响应信息
     */
    private String msg;
    /**
     * 数据
     */
    private Object data;
}

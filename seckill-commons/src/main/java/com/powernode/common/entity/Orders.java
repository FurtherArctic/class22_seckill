package com.powernode.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单类
 *
 * @author wangjunchen
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
    private Integer id;
    private Integer uid;
    private Integer goodsId;
    private Integer buyNum;
    private BigDecimal buyPrice;
    private BigDecimal orderMoney;
    private Date createTime;
    private Date updateTime;
    private Integer status;
}

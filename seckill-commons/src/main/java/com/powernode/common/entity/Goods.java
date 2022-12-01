package com.powernode.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品信息类
 *
 * @author wangjunchen
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
    private Integer id;
    private String name;
    private String nameDesc;
    private String randomName;
    private BigDecimal price;
    private String imageUrl;
    private Integer store;
    private Date startTime;
    private Date endTime;
}

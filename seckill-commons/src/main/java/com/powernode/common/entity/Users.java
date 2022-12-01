package com.powernode.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 模拟用户类，实际上数据库中不存在
 *
 * @author wangjunchen
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    private Integer id;
    private String name;
    private String phone;
}

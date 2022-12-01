package com.powernode.seckillservice.dao;

import com.powernode.common.entity.Orders;
import org.apache.ibatis.annotations.Param;

/**
 * @author wangjunchen
 */
public interface OrdersDao {
    /**
     * 下订单，向数据库中插入一条记录
     *
     * @param orders 订单信息
     * @return 返回值是插入结果
     */
    int addOrder(Orders orders);

    /**
     * 根据订单id更新订单状态
     *
     * @param orders 订单对象
     * @return 更新结果
     */
    int updateStatusById(Orders orders);

    /**
     * 根据订单id查询订单
     *
     * @param id 订单id
     * @return 查询出来的订单
     */
    Orders getById(@Param("id") Integer id);
}

package com.powernode.seckillservice;

import com.powernode.common.entity.Orders;
import com.powernode.seckillservice.dao.OrdersDao;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author wangjunchen
 */
@SpringBootTest
public class OrdersTest {
    @Resource
    OrdersDao ordersDao;
    @Test
    void addOrder(){
        Date date = new Date();
        Orders orders = Orders.builder().uid(1006).buyNum(1).buyPrice(new BigDecimal("3000")).orderMoney(new BigDecimal("3000")).goodsId(6).status(0).createTime(date).updateTime(date).build();

        int addResult = ordersDao.addOrder(orders);
        assertEquals(1, addResult);
    }
    @Test
    void updateStatusById(){
        Date date = new Date();
        Orders orders = Orders.builder().id(4).uid(1006).buyNum(1).buyPrice(new BigDecimal("3000")).orderMoney(new BigDecimal("3000")).goodsId(6).status(2).createTime(date).updateTime(date).build();
        int i = ordersDao.updateStatusById(orders);
        assertEquals(1, i);
    }
    @Test
    void getById() {
        Orders orders = ordersDao.getById(3);
        assertNotNull(orders);
    }
}

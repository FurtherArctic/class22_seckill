package com.powernode.seckillservice;

import com.powernode.common.entity.Goods;
import com.powernode.seckillservice.dao.GoodsDao;
import com.powernode.seckillservice.dao.OrdersDao;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class SeckillServiceApplicationTests {
    @Resource
    GoodsDao goodsDao;
    @Resource
    OrdersDao ordersDao;

    @Test
    void contextLoads() {
    }

    @Test
    void TestQuerySeckillList() {
        List<Goods> goodsList = goodsDao.querySeckillList();
        assertFalse(goodsList.isEmpty());
    }

    @Test
    void updateStoreById() {
        int i = goodsDao.updateStoreById(3);
        assertEquals(1, i);
    }

    @Test
    void getById() {
        Goods goods = goodsDao.getById(1);
        assertNotNull(goods);
    }

}

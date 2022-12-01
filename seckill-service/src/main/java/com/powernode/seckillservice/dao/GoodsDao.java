package com.powernode.seckillservice.dao;

import com.powernode.common.entity.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wangjunchen
 */
public interface GoodsDao {
    /**
     * 获得将要秒杀的商品列表
     *
     * @return 商品列表
     */
    List<Goods> querySeckillList();

    /**
     * 根据商品 id 更新该商品的库存
     *
     * @param id 商品id
     * @return int
     */
    int updateStoreById(@Param("id") int id);

    /**
     * 根据商品id获取商品详情
     *
     * @param id 商品id
     * @return goods
     */
    Goods getById(@Param("id") int id);
}

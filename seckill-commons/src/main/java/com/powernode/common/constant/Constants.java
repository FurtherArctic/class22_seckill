package com.powernode.common.constant;

/**
 * 常量类
 *
 * @author wangjunchen
 */
public class Constants {
    /**
     * ajax 请求时，如果响给前端成功，则返回0
     */
    public static final Integer SUCCESS = 0;

    /**
     * ajax 请求时，如果响给前端有错误，则返回0
     */
    public static final Integer ERROR = -1;

    /**
     * 登录用户session存储的名字
     */
    public static final String LOGIN_USER = "login_user";
    /**
     * 每种商品存到redis中的key的前缀
     */
    public static final String REDIS_GOODS_PREFIX = "redis:goods:";

    /**
     * 每种商品存到redis中的库存key的前缀
     */
    public static final String REDIS_STORE_PREFIX = "redis:store:";
}

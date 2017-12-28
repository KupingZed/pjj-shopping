package com.iotek.dao;

import com.iotek.po.Product;

import java.util.List;

/**
 * Created by 15311 on 2017/12/17.
 */
public interface ProductDao extends BaseDao<Product>{
    //    模糊查询商品  phone
    List<Product> queryProductLikePhone(String name0, String name1);

    //    通过商品详情和商品价格查询商品
    List<Product>  queryProducBydetailandPrice(Product product);

    List<Product> queryProductIds(List<Product> products);
}

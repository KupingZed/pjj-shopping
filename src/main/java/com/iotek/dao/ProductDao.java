package com.iotek.dao;

import com.iotek.po.Product;

import java.util.List;

/**
 * Created by 15311 on 2017/12/17.
 */
public interface ProductDao extends BaseDao<Product>{
    //    ģ����ѯ��Ʒ  phone
    List<Product> queryProductLikePhone(String name0, String name1);

    //    ͨ����Ʒ�������Ʒ�۸��ѯ��Ʒ
    List<Product>  queryProducBydetailandPrice(Product product);

    List<Product> queryProductIds(List<Product> products);
}

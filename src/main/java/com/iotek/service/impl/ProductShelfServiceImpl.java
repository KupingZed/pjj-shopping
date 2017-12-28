package com.iotek.service.impl;

import com.iotek.dao.ProductShelfDao;
import com.iotek.po.ProductShelf;
import com.iotek.service.ProductShelfService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 15311 on 2017/12/19.
 */
@Service(value = "productShelfService")
//事务注解
//@Transactional
public class ProductShelfServiceImpl implements ProductShelfService {
    @Autowired
    //默认通过类名来映射
    private ProductShelfDao productShelfDao;

    public ProductShelfDao getProductShelfDao() {
        return productShelfDao;
    }

    public void setProductShelfDao(ProductShelfDao productShelfDao) {
        this.productShelfDao = productShelfDao;
    }

    @Override
    public boolean add(ProductShelf productShelf) {

        return productShelfDao.add(productShelf);
    }

    @Override
    public boolean delete(ProductShelf productShelf) {
        return false;
    }

    @Override
    public boolean update(ProductShelf productShelf) {
        return false;
    }

    @Override
    public ProductShelf query(ProductShelf productShelf) {
      return null;
    }

    @Override
    public List<ProductShelf> queryAll() {
        return null;
    }

    @Override
    public boolean upShelf(ProductShelf productShelf) {
        if (productShelf == null) {
            return false;
        }
        ProductShelf queryProductShelf = productShelfDao.query(productShelf);
        if(queryProductShelf!=null){
            //增加
            productShelfDao.add(productShelf);
        }else{
            //如果存在  更新
            productShelfDao.update(productShelf);
        }
            return true;
        /*if (productShelf == null) {
            return false;
        }
        SqlSession session = MybatisSessionFactory.getSession();
        ProductShelfDao mapper = session.getMapper(ProductShelfDao.class);
        ProductShelf queryProductShelf = mapper.query(productShelf);
        try {
            if(queryProductShelf!=null){
                mapper.add(productShelf);
            }else{
                mapper.update(productShelf);
            }
            session.commit();
            return true;
        } catch (Exception e) {
            session.rollback();
            e.printStackTrace();
            return false;
        } finally {
            MybatisSessionFactory.close();
        }*/
    }
}

package com.iotek.service.impl;

import com.iotek.dao.ProductDao;
import com.iotek.po.Product;
import com.iotek.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 15311 on 2017/12/17.
 */
@Service(value = "productService")
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductDao productDao;

    public ProductDao getProductDao() {
        return productDao;
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public boolean add(Product product) {
        return false;
       /* if (product == null) {
            return false;
        }
        SqlSession session = MybatisSessionFactory.getSession();
        ProductDao productDao = session.getMapper(ProductDao.class);
        try {
            productDao.add(product);
            ProductDetail productDetail=product.getProductDetail();
            if (productDetail != null) {
                //增加商品
                productDetail.setProductId(product.getId());
                ProductDetailDao productDetailDao = session.getMapper(ProductDetailDao.class);
                productDetailDao.add(productDetail);
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

    @Override
    public boolean delete(Product product) {
        return false;
    }

    @Override
    public boolean update(Product product) {
        return false;
    }

    @Override
    public Product query(Product product) {
        return null;
    }

    @Override
    public List<Product> queryAll() {
      return productDao.queryAll();
    }


}

package com.iotek.service;

import com.iotek.po.ProductShelf;

/**
 * Created by 15311 on 2017/12/19.
 */
public interface ProductShelfService extends BaseService<ProductShelf>{
    //�ϼ���Ʒ�ķ���
    boolean upShelf(ProductShelf productShelf);
}

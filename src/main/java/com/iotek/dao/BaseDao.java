package com.iotek.dao;

import java.util.List;

/**
 * Created by 15311 on 2017/12/17.
 */
public interface BaseDao<T> {
    boolean add(T t);

    boolean delete(T t);

    boolean update(T t);

    T  query(T t);

    List<T> queryAll();
}

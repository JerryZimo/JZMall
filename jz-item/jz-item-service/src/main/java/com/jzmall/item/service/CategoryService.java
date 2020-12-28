package com.jzmall.item.service;

import com.jzmall.item.pojo.Category;

import java.util.List;

/**
 * @author: Ling
 * @date: 2020/12/28 16:40
 */
public interface CategoryService {

    /**
     * 查询商品分类的方法
     *
     * @param pid
     * @return
     */
    public List<Category> queryCategoryListByPid(Long pid);

    /**
     * 根据商品分类cid列表查询分类集合
     *
     * @param cids
     * @return
     */
    public List<Category> queryByIds(List<Long> cids);
}

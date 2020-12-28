package com.jzmall.item.web;

import com.jzmall.item.api.CategoryApi;
import com.jzmall.item.pojo.Category;

import java.util.List;

/**
 * @author: Ling
 * @date: 2020/12/28 16:24
 */
public class CategoryController implements CategoryApi {
    @Override
    public List<Category> queryCategoryByIds(List<Long> ids) {
        return null;
    }
}

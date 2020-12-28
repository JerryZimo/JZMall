package com.jzmall.item.service.impl;

import com.jzmall.item.pojo.Category;
import com.jzmall.item.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Ling
 * @date: 2020/12/28 17:00
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Override
    public List<Category> queryCategoryListByPid(Long pid) {
        return null;
    }

    @Override
    public List<Category> queryByIds(List<Long> cids) {
        return null;
    }
}

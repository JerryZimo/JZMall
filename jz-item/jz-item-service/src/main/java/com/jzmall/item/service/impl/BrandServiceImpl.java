package com.jzmall.item.service.impl;

import com.jzmall.common.vo.PageResult;
import com.jzmall.item.pojo.Brand;
import com.jzmall.item.service.BrandService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Ling
 * @date: 2020/12/28 17:00
 */
@Service
public class BrandServiceImpl implements BrandService {
    @Override
    public PageResult<Brand> queryBrandByPage(Integer page, Integer rows, String sortBy, boolean desc, String key) {
        return null;
    }

    @Override
    public void updateBrand(List<Long> categories, Brand brand) {

    }

    @Override
    public void saveBrand(Brand brand, List<Long> cids) {

    }

    @Override
    public void deleteBrand(Long bid) {

    }

    @Override
    public Brand queryById(Long id) {
        return null;
    }

    @Override
    public List<Brand> queryBrandByCid(Long cid) {
        return null;
    }

    @Override
    public List<Brand> queryBrandsByIds(List<Long> ids) {
        return null;
    }
}

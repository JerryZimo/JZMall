package com.jzmall.item.service;

import com.jzmall.common.vo.PageResult;
import com.jzmall.item.pojo.Brand;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: Ling
 * @date: 2020/12/28 16:39
 */
public interface BrandService {

    /**
     * 根据多个条件查询品牌信息
     *
     * @param page
     * @param rows
     * @param sortBy
     * @param desc
     * @param key
     * @return
     */
    public PageResult<Brand> queryBrandByPage(Integer page, Integer rows, String sortBy, boolean desc, String key);

    /**
     * 品牌的修改
     *
     * @param categories
     * @param brand
     */
    public void updateBrand(List<Long> categories, Brand brand);

    /**
     * 品牌新增
     *
     * @param brand
     * @param cids
     */
    public void saveBrand(Brand brand, List<Long> cids);

    /**
     * 品牌的删除后
     *
     * @param bid
     */
    public void deleteBrand(Long bid);

    /**
     * 根据品牌brandid查询品牌名称
     *
     * @param id
     * @return
     */
    public Brand queryById(Long id);

    /**
     * 根据cid查到所有的品牌
     *
     * @param cid
     * @return
     */
    public List<Brand> queryBrandByCid(Long cid);

    /**
     * 根据bid的集合查询品牌信息
     *
     * @param ids
     * @return
     */
    public List<Brand> queryBrandsByIds(List<Long> ids);

}

package com.jzmall.item.service;

import com.jzmall.item.pojo.SpecGroup;
import com.jzmall.item.pojo.SpecParam;

import java.util.List;

/**
 * @author: Ling
 * @date: 2020/12/28 16:40
 */
public interface SpecificationService {

    /**
     * 查询规格组
     * @param cid
     * @return
     */
    public List<SpecGroup> queryGroupByCid(Long cid);

    /**
     * 查询指定规格参数
     * @param gid
     * @param cid
     * @param searching
     * @return
     */
    public List<SpecParam> querySpecParams(Long gid, Long cid, Boolean searching);

    /**
     * 查询规格组及组内规格参数
     * @param cid
     * @return
     */
    public List<SpecGroup> querySpecsByCid(Long cid);

    /**
     * 新增规格组
     * @param specGroup
     */
    public void saveSpecGroup(SpecGroup specGroup);

    /**
     * 删除规格组
     * @param id
     */
    public void deleteSpecGroup(Long id);

    /**
     * 修改规格组
     * @param specGroup
     */
    public void updateSpecGroup(SpecGroup specGroup);

    /**
     * 新增规格参数
     * @param specParam
     */
    public void saveSpecParam(SpecParam specParam);

    /**
     * 修改规格参数
     * @param specParam
     */
    public void updateSpecParam(SpecParam specParam);

    /**
     * 删除规格参数
     * @param id
     */
    public void deleteSpecParam(Long id);

    /**
     * 根据 cid 查询规格组及其规格参数
     * @param cid
     * @return
     */
    public List<SpecGroup> queryListByCid(Long cid);
}

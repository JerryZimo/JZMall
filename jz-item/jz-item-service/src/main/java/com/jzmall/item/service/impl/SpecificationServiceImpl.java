package com.jzmall.item.service.impl;

import com.jzmall.item.pojo.SpecGroup;
import com.jzmall.item.pojo.SpecParam;
import com.jzmall.item.service.SpecificationService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Ling
 * @date: 2020/12/28 17:01
 */
@Service
public class SpecificationServiceImpl  implements SpecificationService {
    @Override
    public List<SpecGroup> queryGroupByCid(Long cid) {
        return null;
    }

    @Override
    public List<SpecParam> querySpecParams(Long gid, Long cid, Boolean searching) {
        return null;
    }

    @Override
    public List<SpecGroup> querySpecsByCid(Long cid) {
        return null;
    }

    @Override
    public void saveSpecGroup(SpecGroup specGroup) {

    }

    @Override
    public void deleteSpecGroup(Long id) {

    }

    @Override
    public void updateSpecGroup(SpecGroup specGroup) {

    }

    @Override
    public void saveSpecParam(SpecParam specParam) {

    }

    @Override
    public void updateSpecParam(SpecParam specParam) {

    }

    @Override
    public void deleteSpecParam(Long id) {

    }

    @Override
    public List<SpecGroup> queryListByCid(Long cid) {
        return null;
    }
}

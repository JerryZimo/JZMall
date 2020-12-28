package com.jzmall.item.web;

import com.jzmall.item.api.SpecificationApi;
import com.jzmall.item.pojo.SpecGroup;
import com.jzmall.item.pojo.SpecParam;

import java.util.List;

/**
 * @author: Ling
 * @date: 2020/12/28 16:25
 */
public class SpecificationController implements SpecificationApi {
    @Override
    public List<SpecParam> querySpecParams(Long gid, Long cid, Boolean searching) {
        return null;
    }

    @Override
    public List<SpecGroup> queryGroupByCid(Long cid) {
        return null;
    }
}

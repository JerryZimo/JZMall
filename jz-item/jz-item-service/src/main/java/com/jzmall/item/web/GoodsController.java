package com.jzmall.item.web;

import com.jzmall.common.dto.CartDTO;
import com.jzmall.common.vo.PageResult;
import com.jzmall.item.api.GoodsApi;
import com.jzmall.item.pojo.Sku;
import com.jzmall.item.pojo.Spu;
import com.jzmall.item.pojo.SpuDetail;

import java.util.List;

/**
 * @author: Ling
 * @date: 2020/12/28 16:25
 */
public class GoodsController implements GoodsApi {
    @Override
    public SpuDetail querySpuDetailById(Long id) {
        return null;
    }

    @Override
    public List<Sku> querySkuBySpuId(Long spuId) {
        return null;
    }

    @Override
    public PageResult<Spu> querySpuByPage(Integer page, Integer rows, Boolean saleable, String key) {
        return null;
    }

    @Override
    public Spu querySpuById(Long spuId) {
        return null;
    }

    @Override
    public List<Sku> querySkuByIds(List<Long> ids) {
        return null;
    }

    @Override
    public void decreaseStock(List<CartDTO> cartDTOS) {

    }
}

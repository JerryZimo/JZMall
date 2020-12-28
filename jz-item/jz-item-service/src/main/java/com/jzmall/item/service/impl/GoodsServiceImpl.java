package com.jzmall.item.service.impl;

import com.jzmall.common.dto.CartDTO;
import com.jzmall.common.vo.PageResult;
import com.jzmall.item.pojo.Sku;
import com.jzmall.item.pojo.Spu;
import com.jzmall.item.pojo.SpuDetail;
import com.jzmall.item.service.GoodsService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Ling
 * @date: 2020/12/28 17:01
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Override
    public PageResult<Spu> querySpuByPage(Integer page, Integer rows, Boolean saleable, String key) {
        return null;
    }

    @Override
    public void saveGoods(Spu spu) {

    }

    @Override
    public SpuDetail queryDetailById(Long spuId) {
        return null;
    }

    @Override
    public List<Sku> querySkuBySpuId(Long spuId) {
        return null;
    }

    @Override
    public void updateGoods(Spu spu) {

    }

    @Override
    public Spu querySpuById(Long id) {
        return null;
    }

    @Override
    public List<Sku> querySkuBySpuIds(List<Long> ids) {
        return null;
    }

    @Override
    public void decreaseStock(List<CartDTO> cartDTOS) {

    }
}

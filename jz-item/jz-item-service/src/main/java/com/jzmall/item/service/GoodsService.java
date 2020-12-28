package com.jzmall.item.service;

import com.jzmall.common.dto.CartDTO;
import com.jzmall.common.vo.PageResult;
import com.jzmall.item.pojo.Sku;
import com.jzmall.item.pojo.Spu;
import com.jzmall.item.pojo.SpuDetail;

import java.util.List;

public interface GoodsService {

    /**
     * 根据条件查询 Standard Product Unit（SPU）
     * @param page
     * @param rows
     * @param saleable
     * @param key
     * @return
     */
    public PageResult<Spu> querySpuByPage(Integer page, Integer rows, Boolean saleable, String key);

    /**
     * 存储商品
     * @param spu
     */
    public void saveGoods(Spu spu);

    /**
     * 根据id查询SPU详细信息
     * @param spuId
     * @return
     */
    public SpuDetail queryDetailById(Long spuId);

    /**
     * 根据SPU id查询 Stock Keeping Unit（SKU）
     * @param spuId
     * @return
     */
    public List<Sku> querySkuBySpuId(Long spuId);

    /**
     * 更新商品信息
     * @param spu
     */
    public void updateGoods(Spu spu);

    /**
     * 根据 id 查询 SPU
     * @param id
     * @return
     */
    public Spu querySpuById(Long id);

    /**
     * 根据 id 集合 查询 SPU 集合
     * @param ids
     * @return
     */
    public List<Sku> querySkuBySpuIds(List<Long> ids);

    /**
     * 减少库存
     * @param cartDTOS
     */
    public void decreaseStock(List<CartDTO> cartDTOS);
}

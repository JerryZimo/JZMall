package com.jzmall.item.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;

/**
 * @author: Ling
 * @date: 2020/12/28 15:47
 */
@Data
@Table(name = "tb_spec_group")
public class SpecGroup {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;

    private Long cid;

    private String name;

    @Transient
    private List<SpecParam> params; // 该组下的所有规格参数集合
}

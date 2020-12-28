package com.jzmall.item.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author: Ling
 * @date: 2020/12/28 15:22
 */
@Data
@Table(name = "tb_brand")
public class Brand {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;
    private String name;
    private Character letter;
    private String image;
}

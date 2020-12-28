package com.jzmall.item.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;

/**
 * @author: Ling
 * @date: 2020/12/28 15:22
 */
@Table(name = "tb_category")
@Data
public class Category {

    /**
     * id
     */
    @Id //声明一个实体类的属性映射为数据库的主键列
    @KeySql(useGeneratedKeys = true) //使用 JDBC 方式获取主键，优先级最高，设置为 true 后，不对其他配置校验
    private Long id;
    private String name;
    private Long parentId;
    private Boolean isParent;
    private Integer sort;

    @Transient  //修饰的字段不会被持久化
    private List<Category> categoryList;
}

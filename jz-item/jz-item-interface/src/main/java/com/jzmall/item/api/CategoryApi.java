package com.jzmall.item.api;

import com.jzmall.item.pojo.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author: Ling
 * @date: 2020/12/28 15:59
 */
public interface CategoryApi {
    @GetMapping("category/list/ids")
    List<Category> queryCategoryByIds(@RequestParam("ids") List<Long> ids);
}

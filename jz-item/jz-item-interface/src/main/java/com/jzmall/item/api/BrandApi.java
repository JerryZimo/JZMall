package com.jzmall.item.api;

import com.jzmall.item.pojo.Brand;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface BrandApi {
    @GetMapping("brand/{id}")
    ResponseEntity<Brand> queryBrandById(@PathVariable("id") Long id);

    @GetMapping("brand/list")
    ResponseEntity<List<Brand>> queryBrandsByIds(@RequestParam("ids") List<Long> ids);
}

package com.wga.sell.service;

import com.wga.sell.dataobject.ProductCategory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * CategoryService
 *
 * @Author wanggaian
 * @Date 2019/7/17 0:10
 */
@Service
public interface CategoryService {

    List<ProductCategory> findAll() throws Exception;

    ProductCategory findById(Integer id) throws Exception;

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypes) throws Exception;

    ProductCategory save(ProductCategory productCategory) throws Exception;
}

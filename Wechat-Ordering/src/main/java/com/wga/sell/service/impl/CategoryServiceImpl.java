package com.wga.sell.service.impl;

import com.wga.sell.dataobject.ProductCategory;
import com.wga.sell.repository.ProductCategoryRepository;
import com.wga.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * CategoryServiceImpl
 *
 * @Author wanggaian
 * @Date 2019/7/17 0:13
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public List<ProductCategory> findAll() throws Exception {
        return repository.findAll();
    }

    @Override
    public ProductCategory findById(Integer id) throws Exception {
        return repository.findById(id).get();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypes) throws Exception {
        return findByCategoryTypeIn(categoryTypes);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) throws Exception {
        return repository.save(productCategory);
    }
}

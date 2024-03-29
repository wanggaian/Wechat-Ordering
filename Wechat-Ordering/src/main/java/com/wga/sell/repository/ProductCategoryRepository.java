package com.wga.sell.repository;

import com.wga.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * ProductCategoryRepository
 *
 * @Author wanggaian
 * @Date 2019/7/13 18:04
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findAllByCategoryTypeIn(List<Integer> categoryTypes);
}

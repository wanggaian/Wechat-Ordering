package com.wga.sell.repository;

import com.wga.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;


/**
 * ProductCategoryRepositoryTest
 *
 * @Author wanggaian
 * @Date 2019/7/13 18:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = repository.getOne(1);
        Optional<ProductCategory> byId = repository.findById(1);
        System.out.println(productCategory.toString());
        System.out.println(byId.toString());
    }

    @Test
    public void updateTest() {
        ProductCategory productCategory = repository.findById(1).get();
        productCategory.setCategoryType(3);
        repository.save(productCategory);
    }

    @Test
    @Transactional
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory("ss女生最爱", 4);

        ProductCategory save = repository.save(productCategory);
        Assert.assertNotNull(save);
    }

    @Test
    public void findAllByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(3, 5, 8);
        List<ProductCategory> allByCategoryTypeIn = repository.findAllByCategoryTypeIn(list);
        Assert.assertNotEquals(0, allByCategoryTypeIn.size());
    }
}
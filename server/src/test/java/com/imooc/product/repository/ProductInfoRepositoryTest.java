package com.imooc.product.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    ProductInfoRepository productInfoRepository;

    @Test
    public void findByProductStatus() {
        List productInfoList = productInfoRepository.findByProductStatus(0);
        Assert.assertTrue(productInfoList.size()>0);
    }

    @Test
    public void findByProductIdIn() {
    }
}
package com.spring.practice.service;

import com.spring.practice.Beans.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {


    Map<String,Product> Products = new HashMap<>() ;
    public List<Product> addProduct(String name, int quantite, int price){
        Products.put(name,new Product(name,quantite , price));
        return new ArrayList<>(Products.values());
    }
    public void deleteProduct(String name)
    {
        Products.remove(name);
    }

}

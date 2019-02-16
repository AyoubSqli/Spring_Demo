package com.spring.practice.controller;

import com.spring.practice.Beans.Product;
import com.spring.practice.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;

@Controller
public class ProductController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @RequestMapping("/test")
    public String addProduct(@RequestParam("name") String name,@RequestParam("quantite") int quantite,@RequestParam("price") int price, Model m) {
        ProductService productService=new ProductService();
        List<Product> products = productService.addProduct(name,quantite,price);
        m.addAttribute("products", products);
        return "home";
    }


}

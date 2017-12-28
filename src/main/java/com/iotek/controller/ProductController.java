package com.iotek.controller;

import com.iotek.po.Product;
import com.iotek.po.ProductShelf;
import com.iotek.po.ProductStock;
import com.iotek.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by 15311 on 2017/12/27.
 * */

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping("/listproduct")
    public String listProduct(Model model){
        List<Product> productList=new ArrayList<>();
        List<Product> products = productService.queryAll();
        for (Product product : products) {
            ProductShelf productShelf = product.getProductShelf();
            ProductStock productStock = product.getProductStock();
            if (productShelf != null&&productStock!=null) {
                if(productShelf.getIsUpShelf()==1&&productStock.getStockNumber()>0){
                    productList.add(product);
                }
            }
        }
        model.addAttribute("productList",productList);
        return "listProduct";
    }
}

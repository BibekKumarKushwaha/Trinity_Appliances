package com.system.trinity.controller;

import com.system.trinity.dto.ProductDto;
import com.system.trinity.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/add")
    public String addProduct(Model model){
        model.addAttribute("productDto",new ProductDto());
        return "create";
    }

    @PostMapping("/save")
    public String saveProduct(ProductDto productDto) throws Exception {
        productService.saveProduct(productDto);
        return "redirect:/product/add";
    }
}

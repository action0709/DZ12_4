package com.example.dz12_spring4.controller;


import com.example.dz12_spring4.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService){
        this.basketService = basketService;
    }
    @GetMapping("/add")
    public void add(@RequestParam("ids") List<Long> ids){
        basketService.add(ids);
    }
    @GetMapping("/get")
    public List<Long>get(){
        return basketService.getAll();
    }
}

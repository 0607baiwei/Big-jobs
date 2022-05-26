package com.kingland.neusoft.course.controller;

import com.kingland.neusoft.course.mapper.dao.GoodsModel;
import com.kingland.neusoft.course.service.GoodsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;


    @PostMapping("/goods")
    public GoodsModel addGoods(@RequestBody GoodsModel goodsModel) {
        return goodsService.addGoods(goodsModel);
    }


    @GetMapping("/goods/count")
    public Map<String, Integer> countGoods() {
        Integer goodsCount = goodsService.countGoods();
        return Map.of("count", goodsCount);
    }

 
    @GetMapping("/goods")
    public List<GoodsModel> getAllGoods() {
        return goodsService.getAllGoods();
    }


    @GetMapping("/goods/{id}")
    public GoodsModel getGoodsById(@PathVariable("id") Long goodsId) {
        return goodsService.getGoodsById(goodsId);
    }


    @DeleteMapping("/goods/{id}")
    @PreAuthorize("hasAnyAuthority('role_admin')")
    public ResponseEntity deleteGoods(@PathVariable("id") Long goodsId) {
        if (goodsService.deleteGoods(goodsId) == 1) {
            // 204
            return ResponseEntity.noContent().build();
        } else {
            // 404
            return ResponseEntity.notFound().build();
        }
    }
}

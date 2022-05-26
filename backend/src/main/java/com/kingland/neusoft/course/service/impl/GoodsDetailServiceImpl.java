package com.kingland.neusoft.course.service.impl;

import java.util.List;

import com.kingland.neusoft.course.mapper.GoodsMapper;
import com.kingland.neusoft.course.mapper.dao.GoodsModel;
import com.kingland.neusoft.course.service.GoodsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsDetailServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public Integer countGoods() {
        return goodsMapper.count();
    }

    @Override
    public GoodsModel getGoodsById(Long GoodsId) {
        return goodsMapper.selectByPrimaryKey(GoodsId);
    }

    @Override
    public List<GoodsModel> getAllGoods() {
        return goodsMapper.query();
    }

    @Override
    public int deleteGoods(Long GoodsId) {
        return goodsMapper.deleteByPrimaryKey(GoodsId);
    }

    @Override
    public GoodsModel addGoods(GoodsModel goodsModel) {
        goodsMapper.insert(goodsModel);
        return goodsModel;
    }

}

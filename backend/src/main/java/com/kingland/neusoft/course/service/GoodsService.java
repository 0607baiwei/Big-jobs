package com.kingland.neusoft.course.service;

import com.kingland.neusoft.course.mapper.GoodsMapper;
import com.kingland.neusoft.course.mapper.dao.GoodsModel;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation class of user service
 *
 * @author KSC
 */

public interface GoodsService {

    public GoodsModel addGoods(GoodsModel goodsModel);

    public Integer countGoods();

    public GoodsModel getGoodsById(Long GoodsId);

    public List<GoodsModel> getAllGoods();

    public int deleteGoods(Long GoodsId);

}

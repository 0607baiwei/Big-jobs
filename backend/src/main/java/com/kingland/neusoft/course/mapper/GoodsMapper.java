package com.kingland.neusoft.course.mapper;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.kingland.neusoft.course.mapper.dao.GoodsModel;

import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Long id);

    Integer insert(GoodsModel record);

    int insertSelective(GoodsModel record);

    GoodsModel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GoodsModel record);

    int updateByPrimaryKey(GoodsModel record);

    GoodsModel selectGoodsByGoodsname(String goodsname);

    List<GoodsModel> query();

    Integer count();
}

package com.mall.distributedshop.product.dao;

import com.mall.distributedshop.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author leo
 * @email 1064603765@qq.com
 * @date 2020-10-26 16:01:22
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

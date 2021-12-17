package cloud.bigdragon.gulimall.product.dao;

import cloud.bigdragon.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author bigdragon
 * @email zhang291640894@gmail.com
 * @date 2021-12-15 20:21:30
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

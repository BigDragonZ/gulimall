package cloud.bigdragon.gulimall.ware.dao;

import cloud.bigdragon.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author bigdragon
 * @email zhang291640894@gmail.com
 * @date 2021-12-16 13:49:03
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}

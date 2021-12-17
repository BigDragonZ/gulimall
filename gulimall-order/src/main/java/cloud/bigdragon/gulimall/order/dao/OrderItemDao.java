package cloud.bigdragon.gulimall.order.dao;

import cloud.bigdragon.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author bigdragon
 * @email zhang291640894@gmail.com
 * @date 2021-12-16 13:42:32
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}

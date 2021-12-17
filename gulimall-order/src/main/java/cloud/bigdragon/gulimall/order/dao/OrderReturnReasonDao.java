package cloud.bigdragon.gulimall.order.dao;

import cloud.bigdragon.gulimall.order.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author bigdragon
 * @email zhang291640894@gmail.com
 * @date 2021-12-16 13:42:32
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}

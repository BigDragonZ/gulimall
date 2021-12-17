package cloud.bigdragon.gulimall.order.dao;

import cloud.bigdragon.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author bigdragon
 * @email zhang291640894@gmail.com
 * @date 2021-12-16 13:42:32
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}

package cloud.bigdragon.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cloud.bigdragon.common.utils.PageUtils;
import cloud.bigdragon.gulimall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author bigdragon
 * @email zhang291640894@gmail.com
 * @date 2021-12-16 13:42:32
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


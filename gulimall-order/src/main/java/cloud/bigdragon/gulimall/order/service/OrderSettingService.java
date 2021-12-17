package cloud.bigdragon.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cloud.bigdragon.common.utils.PageUtils;
import cloud.bigdragon.gulimall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author bigdragon
 * @email zhang291640894@gmail.com
 * @date 2021-12-16 13:42:32
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


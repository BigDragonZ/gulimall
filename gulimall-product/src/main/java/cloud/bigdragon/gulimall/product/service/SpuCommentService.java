package cloud.bigdragon.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cloud.bigdragon.common.utils.PageUtils;
import cloud.bigdragon.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author bigdragon
 * @email zhang291640894@gmail.com
 * @date 2021-12-15 20:21:30
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


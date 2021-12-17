package cloud.bigdragon.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cloud.bigdragon.common.utils.PageUtils;
import cloud.bigdragon.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author bigdragon
 * @email zhang291640894@gmail.com
 * @date 2021-12-16 13:47:41
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


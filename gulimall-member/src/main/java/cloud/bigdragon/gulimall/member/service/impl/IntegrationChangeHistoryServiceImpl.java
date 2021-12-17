package cloud.bigdragon.gulimall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cloud.bigdragon.common.utils.PageUtils;
import cloud.bigdragon.common.utils.Query;

import cloud.bigdragon.gulimall.member.dao.IntegrationChangeHistoryDao;
import cloud.bigdragon.gulimall.member.entity.IntegrationChangeHistoryEntity;
import cloud.bigdragon.gulimall.member.service.IntegrationChangeHistoryService;


@Service("integrationChangeHistoryService")
public class IntegrationChangeHistoryServiceImpl extends ServiceImpl<IntegrationChangeHistoryDao, IntegrationChangeHistoryEntity> implements IntegrationChangeHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<IntegrationChangeHistoryEntity> page = this.page(
                new Query<IntegrationChangeHistoryEntity>().getPage(params),
                new QueryWrapper<IntegrationChangeHistoryEntity>()
        );

        return new PageUtils(page);
    }

}
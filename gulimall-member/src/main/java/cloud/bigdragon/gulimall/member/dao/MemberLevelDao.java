package cloud.bigdragon.gulimall.member.dao;

import cloud.bigdragon.gulimall.member.entity.MemberLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级
 * 
 * @author bigdragon
 * @email zhang291640894@gmail.com
 * @date 2021-12-16 13:47:41
 */
@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevelEntity> {
	
}

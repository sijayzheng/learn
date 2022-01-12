package zheng.sijay.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import zheng.sijay.mybatisplus.domain.Pet;

/**
 * @author 郑世杰
 */
@Mapper
public interface PetMapper extends BaseMapper<Pet> {
}
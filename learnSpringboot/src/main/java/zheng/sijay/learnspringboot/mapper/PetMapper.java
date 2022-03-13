package zheng.sijay.learnspringboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import zheng.sijay.learnspringboot.domain.Pet;

import java.util.List;

/**
 * @author 郑世杰
 */
@Mapper
public interface PetMapper {
    List<Pet> listAll();
}
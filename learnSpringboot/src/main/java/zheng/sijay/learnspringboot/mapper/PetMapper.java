package zheng.sijay.learnspringboot.mapper;

import org.springframework.stereotype.Component;
import zheng.sijay.learnspringboot.domain.Pet;

import java.util.List;

/**
 * @author 郑世杰
 */
// @Mapper
@Component
public interface PetMapper {
    List<Pet> listAll();
}
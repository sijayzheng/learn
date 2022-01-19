package zheng.sijay.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import zheng.sijay.mybatisplus.domain.Pet;
import zheng.sijay.mybatisplus.mapper.PetMapper;
import zheng.sijay.mybatisplus.service.IPetService;

/**
 * @author 郑世杰
 */
@Service
public class PetServiceImpl extends ServiceImpl<PetMapper, Pet> implements IPetService {
}
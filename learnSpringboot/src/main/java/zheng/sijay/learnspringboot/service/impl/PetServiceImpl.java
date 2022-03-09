package zheng.sijay.learnspringboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zheng.sijay.learnspringboot.domain.Pet;
import zheng.sijay.learnspringboot.mapper.PetMapper;
import zheng.sijay.learnspringboot.service.IPetService;

import java.util.List;

/**
 * @author 郑世杰
 */
@Service
public class PetServiceImpl implements IPetService {
    @Autowired
    private PetMapper petMapper;

    @Override
    public List<Pet> listAll() {
        return petMapper.listAll();
    }
}
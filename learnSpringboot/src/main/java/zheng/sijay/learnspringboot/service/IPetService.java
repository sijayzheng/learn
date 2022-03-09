package zheng.sijay.learnspringboot.service;


import zheng.sijay.learnspringboot.domain.Pet;

import java.util.List;

/**
 * @author 郑世杰
 */
public interface IPetService {
    List<Pet> listAll();
}
package zheng.sijay.mybatisplus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zheng.sijay.mybatisplus.domain.Pet;
import zheng.sijay.mybatisplus.service.IPetService;

import java.util.List;

/**
 * @author 郑世杰
 */
@RestController
public class PetController {

    @Autowired
    private IPetService petService;

    @GetMapping("list")
    public List<Pet> listAll() {
        return petService.list();
    }

}
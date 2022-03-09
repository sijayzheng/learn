package zheng.sijay.learnspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zheng.sijay.learnspringboot.domain.Pet;
import zheng.sijay.learnspringboot.service.IPetService;

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
        return petService.listAll();
    }

}
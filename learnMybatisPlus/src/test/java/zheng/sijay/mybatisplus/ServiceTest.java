package zheng.sijay.mybatisplus;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import zheng.sijay.mybatisplus.service.IPetService;

/**
 * @author 郑世杰
 */
@SpringBootTest
public class ServiceTest {

    @Autowired
    private IPetService petService;

    @Test
    public void list() {
        petService.list().forEach(System.out::println);
    }
}
package zheng.sijay.mybatisplus;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import zheng.sijay.mybatisplus.service.IPetService;
import zheng.sijay.mybatisplus.service.ISelectService;

/**
 * @author 郑世杰
 */
@SpringBootTest
public class ServiceTest {

    @Autowired
    private IPetService petService;
    @Autowired
    private ISelectService selectService;

    @Test
    public void list() {
        selectService.list();
    }
}
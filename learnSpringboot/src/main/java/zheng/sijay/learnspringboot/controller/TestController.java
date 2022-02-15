package zheng.sijay.learnspringboot.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zheng.sijay.learnspringboot.config.TestConfig;

/**
 * @author 郑世杰
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestConfig testConfig;

    @GetMapping("/test")
    public void test() {
        System.out.println("test");
        System.out.println(testConfig.getTesta());
        System.out.println(testConfig.getTestb());
        System.out.println(JSON.toJSONString(testConfig.getUsers()));
    }
}
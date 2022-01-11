package zheng.sijay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 郑世杰
 */
@SpringBootApplication
@MapperScan("zheng.sijay.mybatisplus.mapper")
public class LearnMybatisPlus01 {

    public static void main(String[] args) {
        SpringApplication.run(LearnMybatisPlus01.class, args);
    }

}

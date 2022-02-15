package zheng.sijay.learnspringboot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 郑世杰
 */
@Data
@Component
@ConfigurationProperties(prefix = "testconfig")
public class TestConfig {
    private String[] users;
    private String testa;
    private String testb;
}
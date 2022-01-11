package zheng.sijay.mybatisplus.domain;

import lombok.Data;

/**
 * @author 郑世杰
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String pwd;

    public User(String name) {
        this.name = name;
    }
}

package zheng.sijay.mybatisplus.domain;

import lombok.Data;

/**
 * @author 郑世杰
 */
@Data
public class Pet {
    private Integer id;
    private String name;
    private String type;
    private Integer age;
}
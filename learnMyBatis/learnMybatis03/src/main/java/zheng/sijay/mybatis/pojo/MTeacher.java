package zheng.sijay.mybatis.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author 郑世杰
 * @date 2022/2/8 15:32
 */
@Data
public class MTeacher {
    private Integer id;
    private String name;
    private List<MStudent> students;
}

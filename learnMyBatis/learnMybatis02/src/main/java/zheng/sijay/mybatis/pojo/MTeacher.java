package zheng.sijay.mybatis.pojo;

/**
 * @author 郑世杰
 * @date 2022/2/8 15:32
 */
public class MTeacher {
    private Integer id;
    private String name;

    public MTeacher(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MTeacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

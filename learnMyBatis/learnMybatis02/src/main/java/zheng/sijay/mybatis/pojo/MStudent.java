package zheng.sijay.mybatis.pojo;

/**
 * @author 郑世杰
 * @date 2022/2/8 15:32
 */
public class MStudent {
    private Integer id;
    private String name;
    private MTeacher mTeacher;

    public MStudent(Integer id, String name, MTeacher mTeacher) {
        this.id = id;
        this.name = name;
        this.mTeacher = mTeacher;
    }

    public MStudent() {
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

    public MTeacher getmTeacher() {
        return mTeacher;
    }

    public void setmTeacher(MTeacher mTeacher) {
        this.mTeacher = mTeacher;
    }

    @Override
    public String toString() {
        return "MStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mTeacher=" + mTeacher +
                '}';
    }
}
